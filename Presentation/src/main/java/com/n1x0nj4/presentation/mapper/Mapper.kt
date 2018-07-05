package com.n1x0nj4.presentation.mapper

interface Mapper<out V, in D> {

    fun mapToView(type: D): V
}