package com.main.activity

import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.main.adapter.OrganizationAdapter
import com.main.api.APIService
import com.main.api.APIUntil
import com.main.model.GithubConstants
import com.main.model.Org
import kotlinx.android.synthetic.main.activity_organization.*
import retrofit2.Call
import retrofit2.Response

class OrganizationActivity : AppCompatActivity() {
    private lateinit var mApiService: APIService

    override fun onCreate(savedInstanceState: Bundle?) {
        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organization)

        mApiService = APIUntil.server
        customToolbar()
        addDataOrgan()
    }

    private fun customToolbar() {
        //set toolbar
        setSupportActionBar(toolBar)
        toolBar.setNavigationIcon(R.drawable.ic_back_black_24dp)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolBar.setNavigationOnClickListener {
            finish()
        }
    }

    private fun addDataOrgan() {
        var orgList: List<Org>
        var orgAdapter: OrganizationAdapter
        rc_listOrg.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mApiService.getAllOrg("${GithubConstants.ACCESS_TOKEN}")
            .enqueue(object : retrofit2.Callback<List<Org>> {
                override fun onFailure(call: Call<List<Org>>, t: Throwable) {
                    Log.e("onFailure", t.message)
                }

                override fun onResponse(call: Call<List<Org>>, response: Response<List<Org>>) {
                    orgList = response.body() as List<Org>
                    orgAdapter = OrganizationAdapter(this@OrganizationActivity, orgList) { org ->
                    }
                    rc_listOrg?.adapter = orgAdapter
                    rc_listOrg?.setHasFixedSize(true)
                    orgAdapter.notifyDataSetChanged()
                }

            })
    }
}
