package com.heronet.sust.feature.campus.data.remote

import com.heronet.sust.feature.campus.data.remote.dto.CenterEmployeeDto
import com.heronet.sust.feature.campus.data.remote.dto.HallEmployeeDto
import com.heronet.sust.feature.campus.data.remote.dto.OfficeEmployeeDto
import com.heronet.sust.feature.campus.data.remote.dto.SchoolEmployeeDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CampusApi {
    @GET("employees/center")
    suspend fun getCenterEmployees(@Query("title") centerName: String): List<CenterEmployeeDto>
    @GET("employees/hall")
    suspend fun getHallEmployees(@Query("title") hallName: String): List<HallEmployeeDto>
    @GET("employees/office")
    suspend fun getOfficeEmployees(@Query("title") officeName: String): List<OfficeEmployeeDto>
    @GET("employees/school")
    suspend fun getSchoolEmployees(@Query("title") schoolName: String): List<SchoolEmployeeDto>

}