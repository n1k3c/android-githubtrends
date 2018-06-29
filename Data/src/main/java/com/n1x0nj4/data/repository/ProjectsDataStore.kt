package com.n1x0nj4.data.repository

import com.n1x0nj4.data.model.ProjectEntity
import io.reactivex.Completable
import io.reactivex.Flowable

interface ProjectsDataStore {

    fun getProjects(): Flowable<List<ProjectEntity>>

    fun saveProjects(projects: List<ProjectEntity>): Completable

    fun clearProjects(): Completable

    fun getBookmarkedProjects(): Flowable<List<ProjectEntity>>

    fun setProjectAsBookmarked(projectId: String): Completable

    fun setProjectAsNotBookmarked(projectId: String): Completable
}