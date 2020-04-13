package com.main.api

import com.main.api.APIClient.getApiClientLSP

object APIUntil {
    private const val baseURL =
        "https://api.github.com/" // https://mobishops.herokuapp.com/ http://vtnshop.herokuapp.com/

    val server: APIService
        get() = getApiClientLSP(baseURL)?.create(APIService::class.java)!!
}