package com.heronet.sust.feature.campus.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.heronet.sust.feature.campus.domain.model.Employee

@Dao
interface CampusDao {
    @Query("SELECT * FROM employees WHERE affiliation = :affiliation")
    suspend fun getEmployees(affiliation: String): List<Employee>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEmployee(employee: Employee)
}