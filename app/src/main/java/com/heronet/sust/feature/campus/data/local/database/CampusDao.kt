package com.heronet.sust.feature.campus.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.DepartmentWithEmployees
import com.heronet.sust.feature.campus.domain.model.Employee
import com.heronet.sust.feature.campus.domain.model.School
import kotlinx.coroutines.flow.Flow

@Dao
interface CampusDao {
    @Transaction
    @Query("SELECT * FROM Department")
    suspend fun getDepartmentsWithEmployees(): List<DepartmentWithEmployees>

    @Transaction
    @Query("SELECT * FROM Department WHERE departmentId = :id")
    suspend fun getDepartmentWithEmployees(id: Long): DepartmentWithEmployees

    @Query("SELECT * FROM Department")
    suspend fun getDepartments(): List<Department>

    @Query("SELECT * FROM Department WHERE school = :school")
    suspend fun getDepartmentsBySchool(school: String): List<Department>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDepartment(department: Department)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEmployee(employee: Employee)


}