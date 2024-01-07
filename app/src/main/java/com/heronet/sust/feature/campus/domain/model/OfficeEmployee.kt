package com.heronet.sust.feature.campus.domain.model

import androidx.room.Entity

@Entity
data class OfficeEmployee (
    val name: String,
    val jobTitle: String,
    val phone: String,
    val email: String,
    val website: String? = null,
    val officeName: String
)