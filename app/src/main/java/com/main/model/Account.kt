package com.main.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Account : Serializable {
    @SerializedName("login")
    @Expose
    private var login: String? = null

    @SerializedName("id")
    @Expose
    private var id: Int? = null

    @SerializedName("node_id")
    @Expose
    private var nodeId: String? = null

    @SerializedName("avatar_url")
    @Expose
    private var avatarUrl: String? = null

    @SerializedName("gravatar_id")
    @Expose
    private var gravatarId: String? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("html_url")
    @Expose
    private var htmlUrl: String? = null

    @SerializedName("followers_url")
    @Expose
    private var followersUrl: String? = null

    @SerializedName("following_url")
    @Expose
    private var followingUrl: String? = null

    @SerializedName("gists_url")
    @Expose
    private var gistsUrl: String? = null

    @SerializedName("starred_url")
    @Expose
    private var starredUrl: String? = null

    @SerializedName("subscriptions_url")
    @Expose
    private var subscriptionsUrl: String? = null

    @SerializedName("organizations_url")
    @Expose
    private var organizationsUrl: String? = null

    @SerializedName("repos_url")
    @Expose
    private var reposUrl: String? = null

    @SerializedName("events_url")
    @Expose
    private var eventsUrl: String? = null

    @SerializedName("received_events_url")
    @Expose
    private var receivedEventsUrl: String? = null

    @SerializedName("type")
    @Expose
    private var type: String? = null

    @SerializedName("site_admin")
    @Expose
    private var siteAdmin: Boolean? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("company")
    @Expose
    private var company: Any? = null

    @SerializedName("blog")
    @Expose
    private var blog: String? = null

    @SerializedName("location")
    @Expose
    private var location: Any? = null

    @SerializedName("email")
    @Expose
    private var email: Any? = null

    @SerializedName("hireable")
    @Expose
    private var hireable: Any? = null

    @SerializedName("bio")
    @Expose
    private var bio: Any? = null

    @SerializedName("public_repos")
    @Expose
    private var publicRepos: Int? = null

    @SerializedName("public_gists")
    @Expose
    private var publicGists: Int? = null

    @SerializedName("followers")
    @Expose
    private var followers: Int? = null

    @SerializedName("following")
    @Expose
    private var following: Int? = null

    @SerializedName("created_at")
    @Expose
    private var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    private var updatedAt: String? = null

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

    fun getAvatarUrl(): String? {
        return avatarUrl
    }

    fun setAvatarUrl(avatarUrl: String?) {
        this.avatarUrl = avatarUrl
    }

    fun getGravatarId(): String? {
        return gravatarId
    }

    fun setGravatarId(gravatarId: String?) {
        this.gravatarId = gravatarId
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

    fun getFollowersUrl(): String? {
        return followersUrl
    }

    fun setFollowersUrl(followersUrl: String?) {
        this.followersUrl = followersUrl
    }

    fun getFollowingUrl(): String? {
        return followingUrl
    }

    fun setFollowingUrl(followingUrl: String?) {
        this.followingUrl = followingUrl
    }

    fun getGistsUrl(): String? {
        return gistsUrl
    }

    fun setGistsUrl(gistsUrl: String?) {
        this.gistsUrl = gistsUrl
    }

    fun getStarredUrl(): String? {
        return starredUrl
    }

    fun setStarredUrl(starredUrl: String?) {
        this.starredUrl = starredUrl
    }

    fun getSubscriptionsUrl(): String? {
        return subscriptionsUrl
    }

    fun setSubscriptionsUrl(subscriptionsUrl: String?) {
        this.subscriptionsUrl = subscriptionsUrl
    }

    fun getOrganizationsUrl(): String? {
        return organizationsUrl
    }

    fun setOrganizationsUrl(organizationsUrl: String?) {
        this.organizationsUrl = organizationsUrl
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

    fun getReceivedEventsUrl(): String? {
        return receivedEventsUrl
    }

    fun setReceivedEventsUrl(receivedEventsUrl: String?) {
        this.receivedEventsUrl = receivedEventsUrl
    }

    fun getType(): String? {
        return type
    }

    fun setType(type: String?) {
        this.type = type
    }

    fun getSiteAdmin(): Boolean? {
        return siteAdmin
    }

    fun setSiteAdmin(siteAdmin: Boolean?) {
        this.siteAdmin = siteAdmin
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getCompany(): Any? {
        return company
    }

    fun setCompany(company: Any?) {
        this.company = company
    }

    fun getBlog(): String? {
        return blog
    }

    fun setBlog(blog: String?) {
        this.blog = blog
    }

    fun getLocation(): Any? {
        return location
    }

    fun setLocation(location: Any?) {
        this.location = location
    }

    fun getEmail(): Any? {
        return email
    }

    fun setEmail(email: Any?) {
        this.email = email
    }

    fun getHireable(): Any? {
        return hireable
    }

    fun setHireable(hireable: Any?) {
        this.hireable = hireable
    }

    fun getBio(): Any? {
        return bio
    }

    fun setBio(bio: Any?) {
        this.bio = bio
    }

    fun getPublicRepos(): Int? {
        return publicRepos
    }

    fun setPublicRepos(publicRepos: Int?) {
        this.publicRepos = publicRepos
    }

    fun getPublicGists(): Int? {
        return publicGists
    }

    fun setPublicGists(publicGists: Int?) {
        this.publicGists = publicGists
    }

    fun getFollowers(): Int? {
        return followers
    }

    fun setFollowers(followers: Int?) {
        this.followers = followers
    }

    fun getFollowing(): Int? {
        return following
    }

    fun setFollowing(following: Int?) {
        this.following = following
    }

    fun getCreatedAt(): String? {
        return createdAt
    }

    fun setCreatedAt(createdAt: String?) {
        this.createdAt = createdAt
    }

    fun getUpdatedAt(): String? {
        return updatedAt
    }

    fun setUpdatedAt(updatedAt: String?) {
        this.updatedAt = updatedAt
    }
}