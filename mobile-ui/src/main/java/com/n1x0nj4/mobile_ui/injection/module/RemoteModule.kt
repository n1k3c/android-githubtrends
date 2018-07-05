package com.n1x0nj4.mobile_ui.injection.module

import com.n1x0nj4.data.repository.ProjectsRemote
import com.n1x0nj4.mobile_ui.BuildConfig
import com.n1x0nj4.remote.ProjectsRemoteImpl
import com.n1x0nj4.remote.service.GithubTrendingService
import com.n1x0nj4.remote.service.GithubTrendingServiceFactory
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class RemoteModule {

    @Module
    companion object {
        @Provides
        @JvmStatic
        fun provideGithubService(): GithubTrendingService {
            return GithubTrendingServiceFactory.makeGithubTrendingService(BuildConfig.DEBUG)
        }
    }

    @Binds
    abstract fun bindProjectsRemote(projectsRemote: ProjectsRemoteImpl): ProjectsRemote
}