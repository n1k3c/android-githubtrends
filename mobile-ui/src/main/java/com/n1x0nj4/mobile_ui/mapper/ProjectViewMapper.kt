package com.n1x0nj4.mobile_ui.mapper

import com.n1x0nj4.mobile_ui.model.Project
import com.n1x0nj4.presentation.model.ProjectView
import javax.inject.Inject

class ProjectViewMapper @Inject constructor(): ViewMapper<ProjectView, Project> {

    override fun mapToView(presentation: ProjectView): Project {
        return Project(presentation.id, presentation.name,
                presentation.fullName, presentation.starCount,
                presentation.dateCreated, presentation.ownerName,
                presentation.ownerAvatar, presentation.isBookmarked)
    }

}