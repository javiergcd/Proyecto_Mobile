package com.rybeler.exampleviewmodel.data.modelComic

data class Characters(
    val available: Int,
    val collectionURI: String,
    val items: List<Item>,
    val returned: Int
)