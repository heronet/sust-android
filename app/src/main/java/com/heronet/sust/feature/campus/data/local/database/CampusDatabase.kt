package com.heronet.sust.feature.campus.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.Employee

@Database(entities = [Department::class, Employee::class], version = 1)
abstract class CampusDatabase: RoomDatabase() {
    abstract val campusDao: CampusDao

    companion object {
        const val DATABASE_NAME = "campus_db"
    }
}