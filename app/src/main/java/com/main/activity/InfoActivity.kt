package com.main.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.main.adapter.RepositoryAdapter
import com.main.api.APIService
import com.main.api.APIUntil
import com.main.model.Account
import com.main.model.Repositories
import kotlinx.android.synthetic.main.activity_info.*
import retrofit2.Call
import retrofit2.Response

class InfoActivity : AppCompatActivity() {
    private lateinit var mApiService: APIService

    override fun onCreate(savedInstanceState: Bundle?) {

        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        mApiService = APIUntil.server

        getData()
        getListRepos()
        //loadDataPage()
    }

    private fun getData() {
        val intent = intent
        var acc = intent.getSerializableExtra("ACCOUNT") as Account
        name.text = acc.getName().toString()
        Glide.with(this).load(acc.getAvatarUrl()).into(avatar_url)
        login.text = acc.getLogin().toString()
    }

    private fun getListRepos() {
        val intent = intent
        var acc = intent.getSerializableExtra("ACCOUNT") as Account
        var login: String? = acc.getLogin()

        var reposList: List<Repositories>
        var adapterRepos: RepositoryAdapter

        rc_listRepos.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        mApiService.getRepository("$login", 1,100)
            .enqueue(object : retrofit2.Callback<List<Repositories>> {
                override fun onFailure(call: Call<List<Repositories>>, t: Throwable) {
                    Log.e("onFailure", t.message)
                }

                override fun onResponse(
                    call: Call<List<Repositories>>,
                    response: Response<List<Repositories>>
                ) {
                    reposList = response.body() as List<Repositories>
                    adapterRepos = RepositoryAdapter(this@InfoActivity, reposList) { repositories ->

                        val intent = Intent(this@InfoActivity, ReposDetailActivity::class.java)
                        intent.putExtra("DETAIL", repositories)
                        startActivity(intent)

                    }
                    rc_listRepos?.adapter = adapterRepos
                    rc_listRepos?.setHasFixedSize(true)
                    adapterRepos.notifyDataSetChanged()
                }

            })
    }
}
