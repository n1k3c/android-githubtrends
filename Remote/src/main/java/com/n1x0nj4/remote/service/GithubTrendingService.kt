package com.n1x0nj4.remote.service

import com.n1x0nj4.remote.model.ProjectsResponseModel
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubTrendingService {

    @GET("search/repositories")
    fun searchRepositories(@Query("q") query: String,
                           @Query("sort") sortBy: String,
                           @Query("order") order: String)
    : Flowable<ProjectsResponseModel>

}