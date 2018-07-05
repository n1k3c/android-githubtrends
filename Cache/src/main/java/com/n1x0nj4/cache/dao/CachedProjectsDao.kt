package com.n1x0nj4.cache.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.n1x0nj4.cache.db.ProjectConstants.DELETE_PROJECTS
import com.n1x0nj4.cache.db.ProjectConstants.QUERY_BOOKMARKED_PROJECTS
import com.n1x0nj4.cache.db.ProjectConstants.QUERY_PROJECTS
import com.n1x0nj4.cache.db.ProjectConstants.QUERY_UPDATE_BOOKMARK_STATUS
import com.n1x0nj4.cache.model.CachedProject
import io.reactivex.Flowable

@Dao
abstract class CachedProjectsDao {

    @Query(QUERY_PROJECTS)
    @JvmSuppressWildcards
    abstract fun getProjects(): Flowable<List<CachedProject>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @JvmSuppressWildcards
    abstract fun insertProjects(projects: List<CachedProject>)

    @Query(DELETE_PROJECTS)
    abstract fun deleteProjects()

    @Query(QUERY_BOOKMARKED_PROJECTS)
    abstract fun getBookmarkedProjects(): Flowable<List<CachedProject>>

    @Query(QUERY_UPDATE_BOOKMARK_STATUS)
    abstract fun setBookmarkStatus(isBookmarked: Boolean,
                                   projectId: String)
}