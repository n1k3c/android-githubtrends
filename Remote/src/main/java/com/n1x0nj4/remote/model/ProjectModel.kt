package com.n1x0nj4.remote.model

import com.google.gson.annotations.SerializedName
import com.n1x0nj4.remote.model.OwnerModel

class ProjectModel(val id: String, val name: String,
                   @SerializedName("full_name") val fullName: String,
                   @SerializedName("stargazers_count") val starCount: Int,
                   @SerializedName("created_at") val dateCreated: String,
                   val owner: OwnerModel)