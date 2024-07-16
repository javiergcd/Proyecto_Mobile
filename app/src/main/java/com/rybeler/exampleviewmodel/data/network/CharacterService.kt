package com.rybeler.exampleviewmodel.data.network

import com.rybeler.exampleviewmodel.data.models.ApiResponse
import com.rybeler.exampleviewmodel.data.models.Character
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterService {

    //v1/public/characters?orderBy=modified
    //v1/public/characters?orderBy=name
    @GET("/v1/public/characters?orderBy=modified")
    suspend fun getCharacters(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): ApiResponse<Character>
}