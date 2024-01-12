package com.heronet.sust.feature.campus.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.heronet.sust.feature.campus.domain.model.Employee

@Dao
interface CampusDao {
    @Query("SELECT * FROM employee WHERE workplaceTitle = :department")
    suspend fun getDepartmentEmployees(department: String): List<Employee>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDepartmentEmployee(employee: Employee)
}