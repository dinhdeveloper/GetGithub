package com.main.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Commits: Serializable {
    @SerializedName("sha")
    @Expose
    private var sha: String? = null

    @SerializedName("node_id")
    @Expose
    private var nodeId: String? = null

    @SerializedName("commit")
    @Expose
    private var commit: Commit? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("html_url")
    @Expose
    private var htmlUrl: String? = null

    @SerializedName("comments_url")
    @Expose
    private var commentsUrl: String? = null

    @SerializedName("author")
    @Expose
    private var author: Author_? = null

    @SerializedName("committer")
    @Expose
    private var committer: Committer_? = null

    @SerializedName("parents")
    @Expose
    private var parents: List<Parent?>? = null

    @SerializedName("stats")
    @Expose
    private var stats: Stats? = null

    @SerializedName("files")
    @Expose
    private var files: List<File?>? = null

    fun getSha(): String? {
        return sha
    }

    fun setSha(sha: String?) {
        this.sha = sha
    }

    fun getNodeId(): String? {
        return nodeId
    }

    fun setNodeId(nodeId: String?) {
        this.nodeId = nodeId
    }

    fun getCommit(): Commit? {
        return commit
    }

    fun setCommit(commit: Commit?) {
        this.commit = commit
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

    fun getCommentsUrl(): String? {
        return commentsUrl
    }

    fun setCommentsUrl(commentsUrl: String?) {
        this.commentsUrl = commentsUrl
    }

    fun getAuthor(): Author_? {
        return author
    }

    fun setAuthor(author: Author_?) {
        this.author = author
    }

    fun getCommitter(): Committer_? {
        return committer
    }

    fun setCommitter(committer: Committer_?) {
        this.committer = committer
    }

    fun getParents(): List<Parent?>? {
        return parents
    }

    fun setParents(parents: List<Parent?>?) {
        this.parents = parents
    }

    fun getStats(): Stats? {
        return stats
    }

    fun setStats(stats: Stats?) {
        this.stats = stats
    }

    fun getFiles(): List<File?>? {
        return files
    }

    fun setFiles(files: List<File?>?) {
        this.files = files
    }
}