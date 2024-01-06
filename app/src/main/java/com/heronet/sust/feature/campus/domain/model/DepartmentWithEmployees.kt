package com.heronet.sust.feature.campus.domain.model

import androidx.room.Embedded
import androidx.room.Relation

data class DepartmentWithEmployees(
    @Embedded val department: Department,
    @Relation(
        parentColumn = "departmentId",
        entityColumn = "affiliationId"
    )
    val employees: List<Employee>
)
