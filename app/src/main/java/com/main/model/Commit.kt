package com.main.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Commit : Serializable {
    @SerializedName("author")
    @Expose
    private var author: Author? = null

    @SerializedName("committer")
    @Expose
    private var committer: Committer? = null

    @SerializedName("message")
    @Expose
    private var message: String? = null

    @SerializedName("tree")
    @Expose
    private var tree: Tree? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("comment_count")
    @Expose
    private var commentCount: Int? = null

    @SerializedName("verification")
    @Expose
    private var verification: Verification? = null

    fun getAuthor(): Author? {
        return author
    }

    fun setAuthor(author: Author?) {
        this.author = author
    }

    fun getCommitter(): Committer? {
        return committer
    }

    fun setCommitter(committer: Committer?) {
        this.committer = committer
    }

    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String?) {
        this.message = message
    }

    fun getTree(): Tree? {
        return tree
    }

    fun setTree(tree: Tree?) {
        this.tree = tree
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String?) {
        this.url = url
    }

    fun getCommentCount(): Int? {
        return commentCount
    }

    fun setCommentCount(commentCount: Int?) {
        this.commentCount = commentCount
    }

    fun getVerification(): Verification? {
        return verification
    }

    fun setVerification(verification: Verification?) {
        this.verification = verification
    }
}