package com.heronet.sust.feature.campus.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Employee(
    @PrimaryKey
    val id: String,
    val name: String,
    val jobTitle: String,
    val phone: String,
    val email: String,
    val website: String? = null,
    val imageUrl: String,
    val workplaceTitle: String
)
