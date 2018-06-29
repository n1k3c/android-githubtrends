package com.n1x0nj4.domain.interactor.bookmark

import com.n1x0nj4.domain.executor.PostExecutionThread
import com.n1x0nj4.domain.interactor.ObservableUseCase
import com.n1x0nj4.domain.model.Project
import com.n1x0nj4.domain.repository.ProjectsRepository
import io.reactivex.Observable
import javax.inject.Inject

open class GetBookmarkedProjects @Inject constructor(
        private val projectsRepository: ProjectsRepository,
        postExecutionThread: PostExecutionThread)
    : ObservableUseCase<List<Project>, Nothing?>(postExecutionThread) {

    public override fun buildUseCaseObservable(params: Nothing?): Observable<List<Project>> {
        return projectsRepository.getBookmarkedProjects()
    }
}