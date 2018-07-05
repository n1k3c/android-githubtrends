package com.n1x0nj4.mobile_ui.injection.module

import android.app.Application
import com.n1x0nj4.cache.ProjectsCacheImpl
import com.n1x0nj4.cache.db.ProjectsDatabase
import com.n1x0nj4.data.repository.ProjectsCache
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class CacheModule {

    @Module
    companion object {
        @Provides
        @JvmStatic
        fun providesDataBase(application: Application): ProjectsDatabase {
            return ProjectsDatabase.getInstance(application)
        }
    }

    @Binds
    abstract fun bindProjectsCache(projectsCache: ProjectsCacheImpl): ProjectsCache
}