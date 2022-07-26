package com.example.androidfinalproject.data.remote_db

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CocktailRemoteDataSource @Inject constructor(
    private val cocktailService: CocktailService) : BaseDataSource() {

    suspend fun getCocktails() = getResult { cocktailService.getAllCocktails() }
    suspend fun getCocktail(id : Int) = getResult { cocktailService.getCocktail(id) }
    suspend fun getCocktailsByName(name : String) = getResult { cocktailService.getAllCocktailsByName(name) }
}