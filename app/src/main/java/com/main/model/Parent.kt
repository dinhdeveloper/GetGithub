package com.main.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Parent:Serializable {
    @SerializedName("sha")
    @Expose
    private var sha: String? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("html_url")
    @Expose
    private var htmlUrl: String? = null

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

    fun getHtmlUrl(): String? {
        return htmlUrl
    }

    fun setHtmlUrl(htmlUrl: String?) {
        this.htmlUrl = htmlUrl
    }
}