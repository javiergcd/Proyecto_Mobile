package com.rybeler.exampleviewmodel.data.models

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize

data class Character(
    val comics: Comics,
    val description: String,
    val events: Events,
    val id: Int,
    val modified: String,
    val name: String,
    val resourceURI: String,
    val series: Series,
    val stories: Stories,
    val thumbnail: Thumbnail,
    val urls: List<Url>
)
    /*: Parcelable

@VersionedParcelize
data class Thumbnail(
    val path: String,
    val extension: String
):Parcelable{
    fun getUrl() = "$path.$extension"
}*/