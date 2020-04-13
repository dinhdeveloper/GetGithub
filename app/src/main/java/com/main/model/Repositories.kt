package com.main.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Repositories : Serializable {
    @SerializedName("id")
    @Expose
    private var id: Int? = null

    @SerializedName("node_id")
    @Expose
    private var nodeId: String? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("full_name")
    @Expose
    private var fullName: String? = null

    @SerializedName("private")
    @Expose
    private var _private: Boolean? = null

    @SerializedName("owner")
    @Expose
    private var owner: Owner? = null

    @SerializedName("html_url")
    @Expose
    private var htmlUrl: String? = null

    @SerializedName("description")
    @Expose
    private var description: Any? = null

    @SerializedName("fork")
    @Expose
    private var fork: Boolean? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("forks_url")
    @Expose
    private var forksUrl: String? = null

    @SerializedName("keys_url")
    @Expose
    private var keysUrl: String? = null

    @SerializedName("collaborators_url")
    @Expose
    private var collaboratorsUrl: String? = null

    @SerializedName("teams_url")
    @Expose
    private var teamsUrl: String? = null

    @SerializedName("hooks_url")
    @Expose
    private var hooksUrl: String? = null

    @SerializedName("issue_events_url")
    @Expose
    private var issueEventsUrl: String? = null

    @SerializedName("events_url")
    @Expose
    private var eventsUrl: String? = null

    @SerializedName("assignees_url")
    @Expose
    private var assigneesUrl: String? = null

    @SerializedName("branches_url")
    @Expose
    private var branchesUrl: String? = null

    @SerializedName("tags_url")
    @Expose
    private var tagsUrl: String? = null

    @SerializedName("blobs_url")
    @Expose
    private var blobsUrl: String? = null

    @SerializedName("git_tags_url")
    @Expose
    private var gitTagsUrl: String? = null

    @SerializedName("git_refs_url")
    @Expose
    private var gitRefsUrl: String? = null

    @SerializedName("trees_url")
    @Expose
    private var treesUrl: String? = null

    @SerializedName("statuses_url")
    @Expose
    private var statusesUrl: String? = null

    @SerializedName("languages_url")
    @Expose
    private var languagesUrl: String? = null

    @SerializedName("stargazers_url")
    @Expose
    private var stargazersUrl: String? = null

    @SerializedName("contributors_url")
    @Expose
    private var contributorsUrl: String? = null

    @SerializedName("subscribers_url")
    @Expose
    private var subscribersUrl: String? = null

    @SerializedName("subscription_url")
    @Expose
    private var subscriptionUrl: String? = null

    @SerializedName("commits_url")
    @Expose
    private var commitsUrl: String? = null

    @SerializedName("git_commits_url")
    @Expose
    private var gitCommitsUrl: String? = null

    @SerializedName("comments_url")
    @Expose
    private var commentsUrl: String? = null

    @SerializedName("issue_comment_url")
    @Expose
    private var issueCommentUrl: String? = null

    @SerializedName("contents_url")
    @Expose
    private var contentsUrl: String? = null

    @SerializedName("compare_url")
    @Expose
    private var compareUrl: String? = null

    @SerializedName("merges_url")
    @Expose
    private var mergesUrl: String? = null

    @SerializedName("archive_url")
    @Expose
    private var archiveUrl: String? = null

    @SerializedName("downloads_url")
    @Expose
    private var downloadsUrl: String? = null

    @SerializedName("issues_url")
    @Expose
    private var issuesUrl: String? = null

    @SerializedName("pulls_url")
    @Expose
    private var pullsUrl: String? = null

    @SerializedName("milestones_url")
    @Expose
    private var milestonesUrl: String? = null

    @SerializedName("notifications_url")
    @Expose
    private var notificationsUrl: String? = null

    @SerializedName("labels_url")
    @Expose
    private var labelsUrl: String? = null

    @SerializedName("releases_url")
    @Expose
    private var releasesUrl: String? = null

    @SerializedName("deployments_url")
    @Expose
    private var deploymentsUrl: String? = null

    @SerializedName("created_at")
    @Expose
    private var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    private var updatedAt: String? = null

    @SerializedName("pushed_at")
    @Expose
    private var pushedAt: String? = null

    @SerializedName("git_url")
    @Expose
    private var gitUrl: String? = null

    @SerializedName("ssh_url")
    @Expose
    private var sshUrl: String? = null

    @SerializedName("clone_url")
    @Expose
    private var cloneUrl: String? = null

    @SerializedName("svn_url")
    @Expose
    private var svnUrl: String? = null

    @SerializedName("homepage")
    @Expose
    private var homepage: Any? = null

    @SerializedName("size")
    @Expose
    private var size: Int? = null

    @SerializedName("stargazers_count")
    @Expose
    private var stargazersCount: Int? = null

    @SerializedName("watchers_count")
    @Expose
    private var watchersCount: Int? = null

    @SerializedName("language")
    @Expose
    private var language: String? = null

    @SerializedName("has_issues")
    @Expose
    private var hasIssues: Boolean? = null

    @SerializedName("has_projects")
    @Expose
    private var hasProjects: Boolean? = null

    @SerializedName("has_downloads")
    @Expose
    private var hasDownloads: Boolean? = null

    @SerializedName("has_wiki")
    @Expose
    private var hasWiki: Boolean? = null

    @SerializedName("has_pages")
    @Expose
    private var hasPages: Boolean? = null

    @SerializedName("forks_count")
    @Expose
    private var forksCount: Int? = null

    @SerializedName("mirror_url")
    @Expose
    private var mirrorUrl: Any? = null

    @SerializedName("archived")
    @Expose
    private var archived: Boolean? = null

    @SerializedName("disabled")
    @Expose
    private var disabled: Boolean? = null

    @SerializedName("open_issues_count")
    @Expose
    private var openIssuesCount: Int? = null

    @SerializedName("license")
    @Expose
    private var license: Any? = null

    @SerializedName("forks")
    @Expose
    private var forks: Int? = null

    @SerializedName("open_issues")
    @Expose
    private var openIssues: Int? = null

    @SerializedName("watchers")
    @Expose
    private var watchers: Int? = null

    @SerializedName("default_branch")
    @Expose
    private var defaultBranch: String? = null

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

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getFullName(): String? {
        return fullName
    }

    fun setFullName(fullName: String?) {
        this.fullName = fullName
    }

    fun getPrivate(): Boolean? {
        return _private
    }

    fun setPrivate(_private: Boolean?) {
        this._private = _private
    }

    fun getOwner(): Owner? {
        return owner
    }

    fun setOwner(owner: Owner?) {
        this.owner = owner
    }

    fun getHtmlUrl(): String? {
        return htmlUrl
    }

    fun setHtmlUrl(htmlUrl: String?) {
        this.htmlUrl = htmlUrl
    }

    fun getDescription(): Any? {
        return description
    }

    fun setDescription(description: Any?) {
        this.description = description
    }

    fun getFork(): Boolean? {
        return fork
    }

    fun setFork(fork: Boolean?) {
        this.fork = fork
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String?) {
        this.url = url
    }

    fun getForksUrl(): String? {
        return forksUrl
    }

    fun setForksUrl(forksUrl: String?) {
        this.forksUrl = forksUrl
    }

    fun getKeysUrl(): String? {
        return keysUrl
    }

    fun setKeysUrl(keysUrl: String?) {
        this.keysUrl = keysUrl
    }

    fun getCollaboratorsUrl(): String? {
        return collaboratorsUrl
    }

    fun setCollaboratorsUrl(collaboratorsUrl: String?) {
        this.collaboratorsUrl = collaboratorsUrl
    }

    fun getTeamsUrl(): String? {
        return teamsUrl
    }

    fun setTeamsUrl(teamsUrl: String?) {
        this.teamsUrl = teamsUrl
    }

    fun getHooksUrl(): String? {
        return hooksUrl
    }

    fun setHooksUrl(hooksUrl: String?) {
        this.hooksUrl = hooksUrl
    }

    fun getIssueEventsUrl(): String? {
        return issueEventsUrl
    }

    fun setIssueEventsUrl(issueEventsUrl: String?) {
        this.issueEventsUrl = issueEventsUrl
    }

    fun getEventsUrl(): String? {
        return eventsUrl
    }

    fun setEventsUrl(eventsUrl: String?) {
        this.eventsUrl = eventsUrl
    }

    fun getAssigneesUrl(): String? {
        return assigneesUrl
    }

    fun setAssigneesUrl(assigneesUrl: String?) {
        this.assigneesUrl = assigneesUrl
    }

    fun getBranchesUrl(): String? {
        return branchesUrl
    }

    fun setBranchesUrl(branchesUrl: String?) {
        this.branchesUrl = branchesUrl
    }

    fun getTagsUrl(): String? {
        return tagsUrl
    }

    fun setTagsUrl(tagsUrl: String?) {
        this.tagsUrl = tagsUrl
    }

    fun getBlobsUrl(): String? {
        return blobsUrl
    }

    fun setBlobsUrl(blobsUrl: String?) {
        this.blobsUrl = blobsUrl
    }

    fun getGitTagsUrl(): String? {
        return gitTagsUrl
    }

    fun setGitTagsUrl(gitTagsUrl: String?) {
        this.gitTagsUrl = gitTagsUrl
    }

    fun getGitRefsUrl(): String? {
        return gitRefsUrl
    }

    fun setGitRefsUrl(gitRefsUrl: String?) {
        this.gitRefsUrl = gitRefsUrl
    }

    fun getTreesUrl(): String? {
        return treesUrl
    }

    fun setTreesUrl(treesUrl: String?) {
        this.treesUrl = treesUrl
    }

    fun getStatusesUrl(): String? {
        return statusesUrl
    }

    fun setStatusesUrl(statusesUrl: String?) {
        this.statusesUrl = statusesUrl
    }

    fun getLanguagesUrl(): String? {
        return languagesUrl
    }

    fun setLanguagesUrl(languagesUrl: String?) {
        this.languagesUrl = languagesUrl
    }

    fun getStargazersUrl(): String? {
        return stargazersUrl
    }

    fun setStargazersUrl(stargazersUrl: String?) {
        this.stargazersUrl = stargazersUrl
    }

    fun getContributorsUrl(): String? {
        return contributorsUrl
    }

    fun setContributorsUrl(contributorsUrl: String?) {
        this.contributorsUrl = contributorsUrl
    }

    fun getSubscribersUrl(): String? {
        return subscribersUrl
    }

    fun setSubscribersUrl(subscribersUrl: String?) {
        this.subscribersUrl = subscribersUrl
    }

    fun getSubscriptionUrl(): String? {
        return subscriptionUrl
    }

    fun setSubscriptionUrl(subscriptionUrl: String?) {
        this.subscriptionUrl = subscriptionUrl
    }

    fun getCommitsUrl(): String? {
        return commitsUrl
    }

    fun setCommitsUrl(commitsUrl: String?) {
        this.commitsUrl = commitsUrl
    }

    fun getGitCommitsUrl(): String? {
        return gitCommitsUrl
    }

    fun setGitCommitsUrl(gitCommitsUrl: String?) {
        this.gitCommitsUrl = gitCommitsUrl
    }

    fun getCommentsUrl(): String? {
        return commentsUrl
    }

    fun setCommentsUrl(commentsUrl: String?) {
        this.commentsUrl = commentsUrl
    }

    fun getIssueCommentUrl(): String? {
        return issueCommentUrl
    }

    fun setIssueCommentUrl(issueCommentUrl: String?) {
        this.issueCommentUrl = issueCommentUrl
    }

    fun getContentsUrl(): String? {
        return contentsUrl
    }

    fun setContentsUrl(contentsUrl: String?) {
        this.contentsUrl = contentsUrl
    }

    fun getCompareUrl(): String? {
        return compareUrl
    }

    fun setCompareUrl(compareUrl: String?) {
        this.compareUrl = compareUrl
    }

    fun getMergesUrl(): String? {
        return mergesUrl
    }

    fun setMergesUrl(mergesUrl: String?) {
        this.mergesUrl = mergesUrl
    }

    fun getArchiveUrl(): String? {
        return archiveUrl
    }

    fun setArchiveUrl(archiveUrl: String?) {
        this.archiveUrl = archiveUrl
    }

    fun getDownloadsUrl(): String? {
        return downloadsUrl
    }

    fun setDownloadsUrl(downloadsUrl: String?) {
        this.downloadsUrl = downloadsUrl
    }

    fun getIssuesUrl(): String? {
        return issuesUrl
    }

    fun setIssuesUrl(issuesUrl: String?) {
        this.issuesUrl = issuesUrl
    }

    fun getPullsUrl(): String? {
        return pullsUrl
    }

    fun setPullsUrl(pullsUrl: String?) {
        this.pullsUrl = pullsUrl
    }

    fun getMilestonesUrl(): String? {
        return milestonesUrl
    }

    fun setMilestonesUrl(milestonesUrl: String?) {
        this.milestonesUrl = milestonesUrl
    }

    fun getNotificationsUrl(): String? {
        return notificationsUrl
    }

    fun setNotificationsUrl(notificationsUrl: String?) {
        this.notificationsUrl = notificationsUrl
    }

    fun getLabelsUrl(): String? {
        return labelsUrl
    }

    fun setLabelsUrl(labelsUrl: String?) {
        this.labelsUrl = labelsUrl
    }

    fun getReleasesUrl(): String? {
        return releasesUrl
    }

    fun setReleasesUrl(releasesUrl: String?) {
        this.releasesUrl = releasesUrl
    }

    fun getDeploymentsUrl(): String? {
        return deploymentsUrl
    }

    fun setDeploymentsUrl(deploymentsUrl: String?) {
        this.deploymentsUrl = deploymentsUrl
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

    fun getPushedAt(): String? {
        return pushedAt
    }

    fun setPushedAt(pushedAt: String?) {
        this.pushedAt = pushedAt
    }

    fun getGitUrl(): String? {
        return gitUrl
    }

    fun setGitUrl(gitUrl: String?) {
        this.gitUrl = gitUrl
    }

    fun getSshUrl(): String? {
        return sshUrl
    }

    fun setSshUrl(sshUrl: String?) {
        this.sshUrl = sshUrl
    }

    fun getCloneUrl(): String? {
        return cloneUrl
    }

    fun setCloneUrl(cloneUrl: String?) {
        this.cloneUrl = cloneUrl
    }

    fun getSvnUrl(): String? {
        return svnUrl
    }

    fun setSvnUrl(svnUrl: String?) {
        this.svnUrl = svnUrl
    }

    fun getHomepage(): Any? {
        return homepage
    }

    fun setHomepage(homepage: Any?) {
        this.homepage = homepage
    }

    fun getSize(): Int? {
        return size
    }

    fun setSize(size: Int?) {
        this.size = size
    }

    fun getStargazersCount(): Int? {
        return stargazersCount
    }

    fun setStargazersCount(stargazersCount: Int?) {
        this.stargazersCount = stargazersCount
    }

    fun getWatchersCount(): Int? {
        return watchersCount
    }

    fun setWatchersCount(watchersCount: Int?) {
        this.watchersCount = watchersCount
    }

    fun getLanguage(): String? {
        return language
    }

    fun setLanguage(language: String?) {
        this.language = language
    }

    fun getHasIssues(): Boolean? {
        return hasIssues
    }

    fun setHasIssues(hasIssues: Boolean?) {
        this.hasIssues = hasIssues
    }

    fun getHasProjects(): Boolean? {
        return hasProjects
    }

    fun setHasProjects(hasProjects: Boolean?) {
        this.hasProjects = hasProjects
    }

    fun getHasDownloads(): Boolean? {
        return hasDownloads
    }

    fun setHasDownloads(hasDownloads: Boolean?) {
        this.hasDownloads = hasDownloads
    }

    fun getHasWiki(): Boolean? {
        return hasWiki
    }

    fun setHasWiki(hasWiki: Boolean?) {
        this.hasWiki = hasWiki
    }

    fun getHasPages(): Boolean? {
        return hasPages
    }

    fun setHasPages(hasPages: Boolean?) {
        this.hasPages = hasPages
    }

    fun getForksCount(): Int? {
        return forksCount
    }

    fun setForksCount(forksCount: Int?) {
        this.forksCount = forksCount
    }

    fun getMirrorUrl(): Any? {
        return mirrorUrl
    }

    fun setMirrorUrl(mirrorUrl: Any?) {
        this.mirrorUrl = mirrorUrl
    }

    fun getArchived(): Boolean? {
        return archived
    }

    fun setArchived(archived: Boolean?) {
        this.archived = archived
    }

    fun getDisabled(): Boolean? {
        return disabled
    }

    fun setDisabled(disabled: Boolean?) {
        this.disabled = disabled
    }

    fun getOpenIssuesCount(): Int? {
        return openIssuesCount
    }

    fun setOpenIssuesCount(openIssuesCount: Int?) {
        this.openIssuesCount = openIssuesCount
    }

    fun getLicense(): Any? {
        return license
    }

    fun setLicense(license: Any?) {
        this.license = license
    }

    fun getForks(): Int? {
        return forks
    }

    fun setForks(forks: Int?) {
        this.forks = forks
    }

    fun getOpenIssues(): Int? {
        return openIssues
    }

    fun setOpenIssues(openIssues: Int?) {
        this.openIssues = openIssues
    }

    fun getWatchers(): Int? {
        return watchers
    }

    fun setWatchers(watchers: Int?) {
        this.watchers = watchers
    }

    fun getDefaultBranch(): String? {
        return defaultBranch
    }

    fun setDefaultBranch(defaultBranch: String?) {
        this.defaultBranch = defaultBranch
    }
}