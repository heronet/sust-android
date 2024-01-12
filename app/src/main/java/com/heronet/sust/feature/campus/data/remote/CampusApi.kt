package com.heronet.sust.feature.campus.data.remote

import com.heronet.sust.feature.campus.data.remote.dto.EmployeeDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CampusApi {
    @GET("employees/{workplaceType}")
    suspend fun getEmployees(@Path("workplaceType") type: String, @Query("title") title: String): List<EmployeeDto>

}