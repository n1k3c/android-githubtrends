package com.n1x0nj4.cache.mapper

interface CacheMapper<C, E> {

    fun mapFromCached(type: C): E

    fun mapToCached(type: E): C
}