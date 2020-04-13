package com.main.activity

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Window
import android.view.WindowManager
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.main.api.APIService
import com.main.api.APIUntil
import com.main.model.Account
import com.main.model.GithubConstants
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener
import retrofit2.Call
import retrofit2.Response
import java.io.OutputStreamWriter
import java.net.URL
import java.util.concurrent.TimeUnit
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {
    lateinit var githubAuthURLFull: String
    private lateinit var githubdialog: Dialog


    var id = ""
    var displayName = ""
    var email = ""
    var avatar = ""
    var accessToken = ""
    var fullname = ""
    var installations = ""

    private lateinit var mApiService: APIService
    var doubleBackToExitPressed: Boolean = false

    companion object {
        // static
        //var USERNAME: String = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mApiService = APIUntil.server

        getDataUser()

        val state = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())

        githubAuthURLFull =
            GithubConstants.AUTHURL + "?client_id=" + GithubConstants.CLIENT_ID + "&scope=" + GithubConstants.SCOPE + "&redirect_uri=" + GithubConstants.REDIRECT_URI + "&state=" + state

        github_login_btn.setOnClickListener {
            setupGithubWebviewDialog(githubAuthURLFull)
        }
    }

    private fun getDataUser() {
        search.setOnClickListener {
            var userName: String = username.text.toString()
            var account: Account

            mApiService.getAccount(userName).enqueue(object : retrofit2.Callback<Account> {
                override fun onFailure(call: Call<Account>, t: Throwable) {
                    Log.e("onFailure", t.message)
                }

                override fun onResponse(call: Call<Account>, response: Response<Account>) {
                    if (response.isSuccessful) {
                        try {
                            account = response.body()!!
                            if (account.getId() != null) {
                                //USERNAME = account.getName().toString()
                                var intent = android.content.Intent(
                                    this@MainActivity,
                                    com.main.activity.InfoActivity::class.java
                                )
                                intent.putExtra("ACCOUNT", account)
                                startActivity(intent)
                            }
                        } catch (e: Exception) {
                            Log.e("NO", e.message)
                        }
                    }

                }

            })
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressed) {
            super.onBackPressed()
            return
        }
        this.doubleBackToExitPressed = true
        Toast.makeText(this, "Nhấn lần nữa để thoát", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({ doubleBackToExitPressed = false }, 2000)
    }

    // Show Github login page in a dialog
    @SuppressLint("SetJavaScriptEnabled")
    fun setupGithubWebviewDialog(url: String) {
        githubdialog = Dialog(this)
        val webView = WebView(this)
        webView.webViewClient = GithubWebViewClient()
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.settings.setSupportZoom(true)
        webView.settings.builtInZoomControls = true
        webView.loadUrl(url)
        githubdialog.setContentView(webView)
        githubdialog.show()
    }

    // A client to know about WebView navigations
    // For API 21 and above
    @Suppress("OverridingDeprecatedMember")
    inner class GithubWebViewClient : WebViewClient() {
        @TargetApi(Build.VERSION_CODES.LOLLIPOP)
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            if (request!!.url.toString().startsWith(GithubConstants.REDIRECT_URI)) {
                handleUrl(request.url.toString())

                // Close the dialog after getting the authorization code
                if (request.url.toString().contains("code=")) {
                    githubdialog.dismiss()
                }
                return true
            }
            return false
        }

        // For API 19 and below
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            if (url.startsWith(GithubConstants.REDIRECT_URI)) {
                handleUrl(url)

                // Close the dialog after getting the authorization code
                if (url.contains("?code=")) {
                    githubdialog.dismiss()
                }
                return true
            }
            return false
        }

        // Check webview url for access token code or error
        private fun handleUrl(url: String) {
            val uri = Uri.parse(url)
            if (url.contains("code")) {
                val githubCode = uri.getQueryParameter("code") ?: ""
                requestForAccessToken(githubCode)
            }
        }
    }


    fun requestForAccessToken(code: String) {
        val grantType = "authorization_code"

        val postParams =
            "grant_type=" + grantType + "&code=" + code + "&redirect_uri=" + GithubConstants.REDIRECT_URI + "&client_id=" + GithubConstants.CLIENT_ID + "&client_secret=" + GithubConstants.CLIENT_SECRET
        GlobalScope.launch(Dispatchers.Default) {
            val url = URL(GithubConstants.TOKENURL)
            val httpsURLConnection =
                withContext(Dispatchers.IO) { url.openConnection() as HttpsURLConnection }
            httpsURLConnection.requestMethod = "POST"
            httpsURLConnection.setRequestProperty(
                "Accept",
                "application/json"
            )
            httpsURLConnection.doInput = true
            httpsURLConnection.doOutput = true
            val outputStreamWriter = OutputStreamWriter(httpsURLConnection.outputStream)
            withContext(Dispatchers.IO) {
                outputStreamWriter.write(postParams)
                outputStreamWriter.flush()
            }
            val response = httpsURLConnection.inputStream.bufferedReader()
                .use { it.readText() }  // defaults to UTF-8
            withContext(Dispatchers.Main) {
                val jsonObject = JSONTokener(response).nextValue() as JSONObject

                val accessToken = jsonObject.getString("access_token") //The access token

                // Get user's id, first name, last name, profile pic url
                fetchGithubUserProfile(accessToken)
                fetchGitUser(accessToken)
            }
        }
    }
    private fun fetchGitUser(token: String){
        GlobalScope.launch(Dispatchers.Default) {
            val tokenURLFull =
                "https://api.github.com/user/repos"

            val url = URL(tokenURLFull)
            val httpsURLConnection =
                withContext(Dispatchers.IO) { url.openConnection() as HttpsURLConnection }
            httpsURLConnection.requestMethod = "GET"
            httpsURLConnection.setRequestProperty("Authorization", "Bearer $token")
            httpsURLConnection.doInput = true
            httpsURLConnection.doOutput = false
            val response = httpsURLConnection.inputStream.bufferedReader()
                .use { it.readText() }  // defaults to UTF-8
            val jsonObject = JSONTokener(response).nextValue() as JSONArray

            //Log.e("GET",jsonObject.toString())

        }
    }

    @SuppressLint("LongLogTag")
    fun fetchGithubUserProfile(token: String) {
        GlobalScope.launch(Dispatchers.Default) {
            val tokenURLFull =
                "https://api.github.com/user"

            val url = URL(tokenURLFull)
            val httpsURLConnection =
                withContext(Dispatchers.IO) { url.openConnection() as HttpsURLConnection }
            httpsURLConnection.requestMethod = "GET"
            httpsURLConnection.setRequestProperty("Authorization", "Bearer $token")
            httpsURLConnection.doInput = true
            httpsURLConnection.doOutput = false
            val response = httpsURLConnection.inputStream.bufferedReader()
                .use { it.readText() }  // defaults to UTF-8
            val jsonObject = JSONTokener(response).nextValue() as JSONObject

            //Log.i("GitHub Access Token: ", token)
            accessToken = token

            // GitHub Id
            val githubId = jsonObject.getInt("id")
            //Log.i("GitHub Id: ", githubId.toString())
            id = githubId.toString()

            // GitHub Display Name
            val githubDisplayName = jsonObject.getString("login")
            //Log.i("GitHub Display Name: ", githubDisplayName)
            displayName = githubDisplayName

            // GitHub fullName
            val fullName = jsonObject.getString("name")
            //Log.i("GitHub fullName: ", fullName)
            fullname = fullName

            // GitHub Email
            val githubEmail = jsonObject.getString("email")
           // Log.i("GitHub Email: ", githubEmail)
            email = githubEmail

            // GitHub Profile Avatar URL
            val githubAvatarURL = jsonObject.getString("avatar_url")
           // Log.i("Github Profile Avatar URL: ", githubAvatarURL)
            avatar = githubAvatarURL

            // Github inStallations:
            val inStallations = jsonObject.toString()
            //Log.i("Github inStallations: ", inStallations)
            installations = inStallations

            openDetailsActivity()
        }
    }


    private fun openDetailsActivity() {
        val myIntent = Intent(this, ProfileActivity::class.java)
        myIntent.putExtra("github_id", id)
        myIntent.putExtra("github_display_name", displayName)
        myIntent.putExtra("github_email", email)
        myIntent.putExtra("github_avatar_url", avatar)
        myIntent.putExtra("github_access_token", accessToken)
        myIntent.putExtra("github_fullname", fullname)
        myIntent.putExtra("github_installations", installations)
        startActivity(myIntent)
    }
}
