package com.main.api

import com.main.model.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.*

interface APIService {

    @GET("users/{username}")
    fun getAccount(@Path("username") username: String): Call<Account>

    @GET("repos/{username}/{detail}/branches")
    fun getBranches(
        @Path("username") username: String,
        @Path("detail") detail: String
    ): Call<List<Branch>>

    @GET("repos/{username}/{detail}")
    fun getRepoDetail(
        @Path("username") username: String,
        @Path("detail") detail: String
    ): Call<ReposDetail>

    @GET("users/{username}/repos")
    fun getRepository(
        @Path("username") username: String,
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ): Call<List<Repositories>>

    @GET("user/repos")
    fun getAllRepository(
        @Query("access_token") access_token: String,
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ): Call<List<Repositories>>

    @GET("user/orgs")
    fun getAllOrg(
        @Query("access_token") access_token: String
    ):Call<List<Org>>

    @GET("user")
    fun getAllResAuth(
        @Query("access_token") access_token: String
    ):Call<AccoutAouth>

    @GET("user/starred")
    fun getAllStarred(
        @Query("access_token") access_token: String
    ):Call<List<AccoutAouth>>


}