package com.n1x0nj4.remote.mapper

import com.n1x0nj4.data.model.ProjectEntity
import com.n1x0nj4.remote.mapper.ModelMapper
import com.n1x0nj4.remote.model.ProjectModel
import javax.inject.Inject

class ProjectsResponseModelMapper @Inject constructor(): ModelMapper<ProjectModel, ProjectEntity> {

    override fun mapFromModel(model: ProjectModel): ProjectEntity {
        return ProjectEntity(model.id, model.name, model.fullName, model.starCount.toString(),
                model.dateCreated, model.owner.ownerName, model.owner.ownerAvatar, false)
    }

}