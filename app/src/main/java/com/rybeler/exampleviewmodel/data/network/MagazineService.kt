package com.rybeler.exampleviewmodel.data.network

import com.rybeler.exampleviewmodel.data.modelMagazine.RemoteMagazine
import com.rybeler.exampleviewmodel.data.modelMagazine.ResultMagazine
import retrofit2.http.GET
import retrofit2.http.Query

interface MagazineService {

    @GET("/v1/public/series?contains=magazine&orderBy=title")
    suspend fun getMagazines(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): RemoteMagazine<ResultMagazine>
}