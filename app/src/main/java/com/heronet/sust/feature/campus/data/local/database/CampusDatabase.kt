package com.heronet.sust.feature.campus.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.heronet.sust.feature.campus.domain.model.Teacher

@Database(entities = [Teacher::class], version = 1)
abstract class CampusDatabase: RoomDatabase() {
    abstract val campusDao: CampusDao

    companion object {
        const val DATABASE_NAME = "campus_db"
    }
}