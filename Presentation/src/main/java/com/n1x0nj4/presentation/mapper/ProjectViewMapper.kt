package com.n1x0nj4.presentation.mapper

import com.n1x0nj4.domain.model.Project
import com.n1x0nj4.presentation.mapper.Mapper
import com.n1x0nj4.presentation.model.ProjectView
import javax.inject.Inject

open class ProjectViewMapper @Inject constructor() : Mapper<ProjectView, Project> {

    override fun mapToView(type: Project): ProjectView {
        return ProjectView(type.id, type.name, type.fullName,
                type.starCount, type.dateCreated, type.ownerName,
                type.ownerAvatar, type.isBookmarked)
    }
}