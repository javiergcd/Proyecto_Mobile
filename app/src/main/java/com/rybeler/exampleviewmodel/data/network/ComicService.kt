package com.rybeler.exampleviewmodel.data.network

import com.rybeler.exampleviewmodel.data.modelComic.RemoteComic
import com.rybeler.exampleviewmodel.data.modelComic.ResultComic
import retrofit2.http.GET
import retrofit2.http.Query

interface ComicService{

    ///v1/public/comics?orderBy=title
    @GET("/v1/public/comics?orderBy=title")
    suspend fun getComics(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): RemoteComic<ResultComic>
}