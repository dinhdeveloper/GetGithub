package com.main.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Plan :Serializable {
    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("space")
    @Expose
    private var space: Int? = null

    @SerializedName("collaborators")
    @Expose
    private var collaborators: Int? = null

    @SerializedName("private_repos")
    @Expose
    private var privateRepos: Int? = null

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getSpace(): Int? {
        return space
    }

    fun setSpace(space: Int?) {
        this.space = space
    }

    fun getCollaborators(): Int? {
        return collaborators
    }

    fun setCollaborators(collaborators: Int?) {
        this.collaborators = collaborators
    }

    fun getPrivateRepos(): Int? {
        return privateRepos
    }

    fun setPrivateRepos(privateRepos: Int?) {
        this.privateRepos = privateRepos
    }

}