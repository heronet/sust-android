package com.heronet.sust.feature.campus.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.heronet.sust.feature.campus.domain.model.Employee

@Dao
interface CampusDao {
    @Query("SELECT * FROM employee WHERE workplaceTitle = :workplaceTitle")
    suspend fun getEmployees(workplaceTitle: String): List<Employee>

    @Query("DELETE FROM employee WHERE workplaceTitle = :workplaceTitle")
    suspend fun deleteEmployees(workplaceTitle: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEmployee(employee: Employee)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEmployees(employees: List<Employee>)
}