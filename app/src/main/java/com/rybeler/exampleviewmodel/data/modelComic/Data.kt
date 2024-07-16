package com.rybeler.exampleviewmodel.data.modelComic

data class Data<T>(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<T>,
    val total: Int
)