package com.main.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Stats: Serializable {
    @SerializedName("total")
    @Expose
    private var total: Int? = null

    @SerializedName("additions")
    @Expose
    private var additions: Int? = null

    @SerializedName("deletions")
    @Expose
    private var deletions: Int? = null

    fun getTotal(): Int? {
        return total
    }

    fun setTotal(total: Int?) {
        this.total = total
    }

    fun getAdditions(): Int? {
        return additions
    }

    fun setAdditions(additions: Int?) {
        this.additions = additions
    }

    fun getDeletions(): Int? {
        return deletions
    }

    fun setDeletions(deletions: Int?) {
        this.deletions = deletions
    }
}