package com.rybeler.exampleviewmodel.data.modelMagazine

data class RemoteMagazine<T>(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val data: Data<T>,
    val etag: String,
    val status: String
)