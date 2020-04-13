package com.main.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.main.adapter.RepositoryAdapter
import com.main.api.APIService
import com.main.api.APIUntil
import com.main.model.Repositories
import kotlinx.android.synthetic.main.activity_organization.*
import kotlinx.android.synthetic.main.activity_repos.*
import kotlinx.android.synthetic.main.activity_repos.toolBar
import retrofit2.Call
import retrofit2.Response

class ResposActivity : AppCompatActivity() {

    private lateinit var mApiService: APIService

    override fun onCreate(savedInstanceState: Bundle?) {
        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repos)

        mApiService = APIUntil.server

        getListRepos()
        customToolbar()
    }
    private fun customToolbar(){
        //set toolbar
        setSupportActionBar(toolBar)
        toolBar.setNavigationIcon(R.drawable.ic_back_black_24dp)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolBar.setNavigationOnClickListener {
            finish()
        }
    }

    private fun getListRepos() {

        val githubId = intent.getStringExtra("github_id")
        val accessToken = intent.getStringExtra("github_access_token")

        var reposList: List<Repositories>
        var adapterRepos: RepositoryAdapter

        rc_listAllRepos.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mApiService.getAllRepository("$accessToken", 1,100)
            .enqueue(object : retrofit2.Callback<List<Repositories>> {
                override fun onFailure(call: Call<List<Repositories>>, t: Throwable) {
                    Log.e("onFailure", t.message)
                }

                override fun onResponse(
                    call: Call<List<Repositories>>,
                    response: Response<List<Repositories>>
                ) {
                    reposList = response.body() as List<Repositories>
                    adapterRepos = RepositoryAdapter(this@ResposActivity, reposList) { repositories ->

                        val intent = Intent(this@ResposActivity, ReposDetailActivity::class.java)
                        intent.putExtra("DETAIL", repositories)
                        startActivity(intent)

                    }
                    //them duong ke ơ giữa
                    val dividerHorizontal = DividerItemDecoration(
                        this@ResposActivity,
                        DividerItemDecoration.VERTICAL
                    )

                    rc_listAllRepos.addItemDecoration(dividerHorizontal)


                    rc_listAllRepos?.adapter = adapterRepos
                    rc_listAllRepos?.setHasFixedSize(true)
                    adapterRepos.notifyDataSetChanged()
                }

            })
    }
}
