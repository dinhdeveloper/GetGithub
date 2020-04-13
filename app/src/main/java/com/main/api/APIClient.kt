package com.main.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {
      var retrofit: Retrofit?=null
    @JvmStatic
    fun getApiClientLSP(url: String?): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create()).build()
        }
        return retrofit
    }
}