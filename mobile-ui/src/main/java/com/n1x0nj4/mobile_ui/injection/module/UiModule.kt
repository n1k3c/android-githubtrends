package com.n1x0nj4.mobile_ui.injection.module

import android.support.annotation.UiThread
import com.n1x0nj4.domain.executor.PostExecutionThread
import com.n1x0nj4.mobile_ui.browse.BrowseActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class UiModule {

    @Binds
    abstract fun bindPostExecutionThread(uiThread: UiThread): PostExecutionThread

    @ContributesAndroidInjector
    abstract fun contributesBrowseActivity(): BrowseActivity
}