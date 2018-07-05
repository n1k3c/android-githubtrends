package com.n1x0nj4.cache.mapper

import com.n1x0nj4.cache.model.CachedProject
import com.n1x0nj4.data.model.ProjectEntity
import javax.inject.Inject

class CachedProjectMapper @Inject constructor(): CacheMapper<CachedProject, ProjectEntity> {

    override fun mapFromCached(type: CachedProject): ProjectEntity {
        return ProjectEntity(type.id, type.name, type.fullName, type.starCount,
                type.dateCreated, type.ownerName, type.ownerAvatar,
                type.isBookmarked)
    }

    override fun mapToCached(type: ProjectEntity): CachedProject {
        return CachedProject(type.id, type.name, type.fullName, type.starCount,
                type.dateCreated, type.ownerName, type.ownerAvatar,
                type.isBookmarked)
    }
}