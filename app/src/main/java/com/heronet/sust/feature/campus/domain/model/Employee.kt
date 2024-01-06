package com.heronet.sust.feature.campus.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Employee(
    @PrimaryKey(autoGenerate = true) val employeeId: Long = 0,
    val name: String,
    val jobTitle: String,
    val phone: String,
    val email: String,
    val website: String? = null,
    val affiliationId: Long
)
