package com.heronet.sust.feature.campus.data.remote

import com.heronet.sust.feature.campus.data.remote.dto.CenterEmployeeDto
import com.heronet.sust.feature.campus.data.remote.dto.HallEmployeeDto
import com.heronet.sust.feature.campus.data.remote.dto.OfficeEmployeeDto
import com.heronet.sust.feature.campus.data.remote.dto.SchoolEmployeeDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CampusApi {
    @GET("/employees?category={center}")
    suspend fun getCenterEmployees(@Query("center") centerName: String): List<CenterEmployeeDto>
    @GET("/employees?category={hall}")
    suspend fun getHallEmployees(@Query("hall") hallName: String): List<HallEmployeeDto>
    @GET("/employees?category={office}")
    suspend fun getOfficeEmployees(@Query("office") officeName: String): List<OfficeEmployeeDto>
    @GET("/employees?category={school}")
    suspend fun getSchoolEmployees(@Query("school") schoolName: String): List<SchoolEmployeeDto>

}
