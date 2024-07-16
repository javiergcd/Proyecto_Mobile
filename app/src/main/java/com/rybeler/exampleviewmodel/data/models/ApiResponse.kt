package com.rybeler.exampleviewmodel.data.models

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize


// data class vs class

data class ApiResponse<T>(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val data: Data<T>,
    val etag: String,
    val status: String
)