package com.main.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class File: Serializable {
    @SerializedName("sha")
    @Expose
    private var sha: String? = null

    @SerializedName("filename")
    @Expose
    private var filename: String? = null

    @SerializedName("status")
    @Expose
    private var status: String? = null

    @SerializedName("additions")
    @Expose
    private var additions: Int? = null

    @SerializedName("deletions")
    @Expose
    private var deletions: Int? = null

    @SerializedName("changes")
    @Expose
    private var changes: Int? = null

    @SerializedName("blob_url")
    @Expose
    private var blobUrl: String? = null

    @SerializedName("raw_url")
    @Expose
    private var rawUrl: String? = null

    @SerializedName("contents_url")
    @Expose
    private var contentsUrl: String? = null

    @SerializedName("patch")
    @Expose
    private var patch: String? = null

    fun getSha(): String? {
        return sha
    }

    fun setSha(sha: String?) {
        this.sha = sha
    }

    fun getFilename(): String? {
        return filename
    }

    fun setFilename(filename: String?) {
        this.filename = filename
    }

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String?) {
        this.status = status
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

    fun getChanges(): Int? {
        return changes
    }

    fun setChanges(changes: Int?) {
        this.changes = changes
    }

    fun getBlobUrl(): String? {
        return blobUrl
    }

    fun setBlobUrl(blobUrl: String?) {
        this.blobUrl = blobUrl
    }

    fun getRawUrl(): String? {
        return rawUrl
    }

    fun setRawUrl(rawUrl: String?) {
        this.rawUrl = rawUrl
    }

    fun getContentsUrl(): String? {
        return contentsUrl
    }

    fun setContentsUrl(contentsUrl: String?) {
        this.contentsUrl = contentsUrl
    }

    fun getPatch(): String? {
        return patch
    }

    fun setPatch(patch: String?) {
        this.patch = patch
    }
}