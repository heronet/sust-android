package com.heronet.sust.feature.campus.util

sealed class EmployeeTypes(val type: String) {
    data object Department: EmployeeTypes("department")
    data object Office: EmployeeTypes("office")
    data object Center: EmployeeTypes("center")
    data object Hall: EmployeeTypes("hall")
}