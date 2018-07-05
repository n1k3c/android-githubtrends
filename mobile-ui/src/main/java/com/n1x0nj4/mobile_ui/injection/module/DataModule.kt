package com.n1x0nj4.mobile_ui.injection.module

import com.n1x0nj4.data.ProjectsDataRepository
import com.n1x0nj4.domain.repository.ProjectsRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    abstract fun bindDataRepository(dataRepository: ProjectsDataRepository): ProjectsRepository
}