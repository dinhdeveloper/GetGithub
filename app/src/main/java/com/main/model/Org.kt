package com.main.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Org :Serializable {
    @SerializedName("login")
    @Expose
    private var login: String? = null

    @SerializedName("id")
    @Expose
    private var id: Int? = null

    @SerializedName("node_id")
    @Expose
    private var nodeId: String? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("repos_url")
    @Expose
    private var reposUrl: String? = null

    @SerializedName("events_url")
    @Expose
    private var eventsUrl: String? = null

    @SerializedName("hooks_url")
    @Expose
    private var hooksUrl: String? = null

    @SerializedName("issues_url")
    @Expose
    private var issuesUrl: String? = null

    @SerializedName("members_url")
    @Expose
    private var membersUrl: String? = null

    @SerializedName("public_members_url")
    @Expose
    private var publicMembersUrl: String? = null

    @SerializedName("avatar_url")
    @Expose
    private var avatarUrl: String? = null

    @SerializedName("description")
    @Expose
    private var description: Any? = null

    fun getLogin(): String? {
        return login
    }

    fun setLogin(login: String?) {
        this.login = login
    }

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getNodeId(): String? {
        return nodeId
    }

    fun setNodeId(nodeId: String?) {
        this.nodeId = nodeId
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String?) {
        this.url = url
    }

    fun getReposUrl(): String? {
        return reposUrl
    }

    fun setReposUrl(reposUrl: String?) {
        this.reposUrl = reposUrl
    }

    fun getEventsUrl(): String? {
        return eventsUrl
    }

    fun setEventsUrl(eventsUrl: String?) {
        this.eventsUrl = eventsUrl
    }

    fun getHooksUrl(): String? {
        return hooksUrl
    }

    fun setHooksUrl(hooksUrl: String?) {
        this.hooksUrl = hooksUrl
    }

    fun getIssuesUrl(): String? {
        return issuesUrl
    }

    fun setIssuesUrl(issuesUrl: String?) {
        this.issuesUrl = issuesUrl
    }

    fun getMembersUrl(): String? {
        return membersUrl
    }

    fun setMembersUrl(membersUrl: String?) {
        this.membersUrl = membersUrl
    }

    fun getPublicMembersUrl(): String? {
        return publicMembersUrl
    }

    fun setPublicMembersUrl(publicMembersUrl: String?) {
        this.publicMembersUrl = publicMembersUrl
    }

    fun getAvatarUrl(): String? {
        return avatarUrl
    }

    fun setAvatarUrl(avatarUrl: String?) {
        this.avatarUrl = avatarUrl
    }

    fun getDescription(): Any? {
        return description
    }

    fun setDescription(description: Any?) {
        this.description = description
    }
}