package com.rybeler.exampleviewmodel.data.modelMagazine

data class Comics(
    val available: Int,
    val collectionURI: String,
    val items: List<Item>,
    val returned: Int
)