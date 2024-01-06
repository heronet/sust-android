package com.heronet.sust.feature.campus.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Department(
    @PrimaryKey(autoGenerate = true) val departmentId: Long = 0,
    val title: String,
    val description: String,
    val school: String,
)
