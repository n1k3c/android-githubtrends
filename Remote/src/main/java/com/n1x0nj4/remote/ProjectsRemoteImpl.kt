package com.n1x0nj4.remote

import com.n1x0nj4.data.model.ProjectEntity
import com.n1x0nj4.data.repository.ProjectsRemote
import com.n1x0nj4.remote.mapper.ProjectsResponseModelMapper
import com.n1x0nj4.remote.service.GithubTrendingService
import io.reactivex.Flowable
import javax.inject.Inject

class ProjectsRemoteImpl @Inject constructor(
        private val service: GithubTrendingService,
        private val mapper: ProjectsResponseModelMapper)
    : ProjectsRemote {

    override fun getProjects(): Flowable<List<ProjectEntity>> {
        return service.searchRepositories("language:kotlin", "stars", "desc")
                .map {
                    it.items.map { mapper.mapFromModel(it) }
                }
    }
}