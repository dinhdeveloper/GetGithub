package com.main.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Branch: Serializable {
    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("commit")
    @Expose
    private var commit: Commit? = null

    @SerializedName("protected")
    @Expose
    private var _protected: Boolean? = null

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getCommit(): Commit? {
        return commit
    }

    fun setCommit(commit: Commit?) {
        this.commit = commit
    }

    fun getProtected(): Boolean? {
        return _protected
    }

    fun setProtected(_protected: Boolean?) {
        this._protected = _protected
    }
}