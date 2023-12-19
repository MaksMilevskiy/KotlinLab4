package com.example.lab4.ui.employee

import com.example.lab4.models.employee.Employee
import com.example.lab4.models.employee.type.Developer
import com.example.lab4.models.employee.type.Designer

enum class EmployeeType {
    DEVELOPER, DESIGNER;

    companion object {
        fun forEmployee(employee: Employee): EmployeeType {
            return when (employee) {
                is Developer -> DEVELOPER
                is Designer -> DESIGNER
                else -> throw IllegalArgumentException("Unknown employee type")
            }
        }
    }
}