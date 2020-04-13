package com.main.activity

import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.main.api.APIService
import com.main.api.APIUntil
import com.main.model.Branch
import com.main.model.Repositories
import kotlinx.android.synthetic.main.activity_repos_detail.*
import retrofit2.Call
import retrofit2.Response


class ReposDetailActivity : AppCompatActivity() {

    private lateinit var mApiService: APIService

    override fun onCreate(savedInstanceState: Bundle?) {

        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repos_detail)

        mApiService = APIUntil.server

        getData()

    }

    private fun getData() {
        val intent = intent
        var repoDetail = intent.getSerializableExtra("DETAIL") as Repositories
        var branch: List<Branch>

        name.text = repoDetail.getName().toString()
        full_name.text = repoDetail.getFullName().toString()

        var login: String = repoDetail.getOwner()?.getLogin().toString()
        var name: String = repoDetail.getName().toString()


        mApiService.getBranches(
            login, name
        ).enqueue(object : retrofit2.Callback<List<Branch>> {
            override fun onFailure(call: Call<List<Branch>>, t: Throwable) {
                Log.e("onFailure", t.message)
            }

            override fun onResponse(call: Call<List<Branch>>, response: Response<List<Branch>>) {
                if (response.isSuccessful) {
                    try {
                        branch = response.body() as List<Branch>
                        for (i in branch.indices) {

                        }

                    } catch (e: Exception) {
                        Log.e("NO", e.message)
                    }
                }
            }

        })
    }

}
