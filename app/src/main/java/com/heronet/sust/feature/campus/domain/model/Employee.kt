package com.heronet.sust.feature.campus.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employees")
data class Employee(
    @PrimaryKey(autoGenerate = true) val employeeId: Int = 0,
    val name: String,
    val jobTitle: String,
    val phone: String,
    val email: String,
    val website: String? = null,
    val affiliation: String
)
