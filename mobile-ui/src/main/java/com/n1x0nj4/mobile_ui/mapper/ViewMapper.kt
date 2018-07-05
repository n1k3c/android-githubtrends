package com.n1x0nj4.mobile_ui.mapper

interface ViewMapper<in P, out V> {

    fun mapToView(presentation: P): V
}