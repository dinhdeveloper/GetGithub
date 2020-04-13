package com.main.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.main.api.APIService
import com.main.api.APIUntil
import com.main.model.Account
import com.main.model.AccoutAouth
import com.main.model.GithubConstants
import com.main.model.Org
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_repos.*
import retrofit2.Call
import retrofit2.Response

class ProfileActivity : AppCompatActivity() {
    private lateinit var mApiService: APIService
    var id = ""
    var displayName = ""
    var email = ""
    var avatar = ""
    var accessToken = ""
    var fullname = ""
    var installations = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        mApiService = APIUntil.server

        callDataFromIntent()
        callDataFollow()
        onClick()
    }

    private fun onClick() {

        val githubId = intent.getStringExtra("github_id")
        val loginName = intent.getStringExtra("github_display_name")
        val avatarURL = intent.getStringExtra("github_avatar_url")
        val accessToken = intent.getStringExtra("github_access_token")
        val fullname = intent.getStringExtra("github_fullname")
        val installations = intent.getStringExtra("github_installations")


        layout_repos.setOnClickListener {
            val myIntent = Intent(this, ResposActivity::class.java)
            myIntent.putExtra("github_id", githubId)
            myIntent.putExtra("github_display_name", loginName)
            myIntent.putExtra("github_avatar_url", avatarURL)
            myIntent.putExtra("github_access_token", accessToken)
            myIntent.putExtra("github_fullname", fullname)
            myIntent.putExtra("github_installations", installations)
            startActivity(myIntent)
        }

        layout_organ.setOnClickListener {
            val myIntent = Intent(this, OrganizationActivity::class.java)
            myIntent.putExtra("github_id", githubId)
            myIntent.putExtra("github_display_name", loginName)
            myIntent.putExtra("github_avatar_url", avatarURL)
            myIntent.putExtra("github_access_token", accessToken)
            myIntent.putExtra("github_fullname", fullname)
            myIntent.putExtra("github_installations", installations)
            startActivity(myIntent)
        }

        layout_start.setOnClickListener {
            val myIntent = Intent(this, ResposActivity::class.java)
            myIntent.putExtra("github_id", githubId)
            myIntent.putExtra("github_display_name", loginName)
            myIntent.putExtra("github_avatar_url", avatarURL)
            myIntent.putExtra("github_access_token", accessToken)
            myIntent.putExtra("github_fullname", fullname)
            myIntent.putExtra("github_installations", installations)
            startActivity(myIntent)
        }
    }

    private fun callDataFollow() {
        //get intent
        val loginName = intent.getStringExtra("github_display_name")

        mApiService.getAccount("$loginName")
            .enqueue(object : retrofit2.Callback<Account> {
                override fun onFailure(call: Call<Account>, t: Throwable) {
                    Log.e("onFailure", t.message)
                }

                override fun onResponse(call: Call<Account>, response: Response<Account>) {
                    followers.text = response.body()?.getFollowers().toString() + " followers"
                    following.text = response.body()?.getFollowing().toString() + " following"

                    following_count.text = response.body()?.getFollowing().toString()
                    follower_count.text = response.body()?.getFollowers().toString()
                }

            })
    }

    private fun callDataFromIntent() {
        //get intent
        val githubId = intent.getStringExtra("github_id")
        val loginName = intent.getStringExtra("github_display_name")
        val avatarURL = intent.getStringExtra("github_avatar_url")
        val accessToken = intent.getStringExtra("github_access_token")
        val fullname = intent.getStringExtra("github_fullname")
        val installations = intent.getStringExtra("github_installations")


        //set data

        Glide.with(this).load(avatarURL).into(imgProfile)
        full_name.text = fullname?.toString()
        username.text = loginName?.toString()

        //get size  organization
        mApiService.getAllOrg("${GithubConstants.ACCESS_TOKEN}")
            .enqueue(object : retrofit2.Callback<List<Org>> {
                override fun onFailure(call: Call<List<Org>>, t: Throwable) {
                    Log.e("onFailure", t.message)
                }

                override fun onResponse(call: Call<List<Org>>, response: Response<List<Org>>) {
                    organ_count.text = response.body()?.size.toString()
                }

            })

        //get size repositories
        mApiService.getAllResAuth("${GithubConstants.ACCESS_TOKEN}").enqueue(object : retrofit2.Callback<AccoutAouth> {
            override fun onFailure(call: Call<AccoutAouth>, t: Throwable) {
                Log.e("onFailure", t.message)
            }

            override fun onResponse(call: Call<AccoutAouth>, response: Response<AccoutAouth>) {
                val all: Int = response.body()?.getPublicRepos()!!.toInt() +
                        response.body()?.getTotalPrivateRepos()!!.toInt()
                repos_count.text = all.toString()
            }

        })

        //get size starred
        mApiService.getAllStarred("${GithubConstants.ACCESS_TOKEN}").enqueue(object :retrofit2.Callback<List<AccoutAouth>>{
            override fun onFailure(call: Call<List<AccoutAouth>>, t: Throwable) {
                Log.e("onFailure", t.message)
            }

            override fun onResponse(
                call: Call<List<AccoutAouth>>,
                response: Response<List<AccoutAouth>>
            ) {
                start_count.text = response.body()?.size.toString()
            }

        })
    }
}
