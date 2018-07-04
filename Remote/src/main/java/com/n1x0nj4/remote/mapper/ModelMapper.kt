package com.n1x0nj4.remote.mapper

interface ModelMapper<in M, out E> {

    fun mapFromModel(model: M): E
}