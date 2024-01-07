package com.heronet.sust.feature.campus.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.heronet.sust.feature.campus.domain.model.SchoolEmployee

@Dao
interface CampusDao {
    @Query("SELECT * FROM schoolemployee WHERE departmentName = :department")
    suspend fun getSchoolEmployees(department: String): List<SchoolEmployee>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchoolEmployee(schoolEmployee: SchoolEmployee)
}