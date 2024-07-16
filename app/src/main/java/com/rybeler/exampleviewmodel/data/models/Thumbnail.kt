package com.rybeler.exampleviewmodel.data.models

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize


data class Thumbnail(
    val extension: String,
    val path: String
)

fun Thumbnail.asString() = "$path.$extension".replace("http","https")