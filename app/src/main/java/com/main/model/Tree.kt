package com.main.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Tree : Serializable {
    @SerializedName("sha")
    @Expose
    private var sha: String? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    fun getSha(): String? {
        return sha
    }

    fun setSha(sha: String?) {
        this.sha = sha
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String?) {
        this.url = url
    }
}