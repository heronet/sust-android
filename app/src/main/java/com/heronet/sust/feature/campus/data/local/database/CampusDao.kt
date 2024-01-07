package com.heronet.sust.feature.campus.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.heronet.sust.feature.campus.domain.model.Teacher

@Dao
interface CampusDao {
    @Query("SELECT * FROM teachers WHERE departmentName = :department")
    suspend fun getTeachers(department: String): List<Teacher>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacher(teacher: Teacher)
}