package com.n1x0nj4.data.repository

import com.n1x0nj4.data.model.ProjectEntity
import io.reactivex.Flowable

interface ProjectsRemote {

    fun getProjects(): Flowable<List<ProjectEntity>>
}