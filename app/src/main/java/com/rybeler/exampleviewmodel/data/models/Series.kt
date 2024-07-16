package com.rybeler.exampleviewmodel.data.models

data class Series(
    val available: Int,
    val collectionURI: String,
    val items: List<Serie>,
    val returned: Int
)