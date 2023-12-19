package com.example.lab4.models.employee.type

import com.example.lab4.models.employee.Salary
import com.example.lab4.models.employee.Efficiency
import com.example.lab4.models.employee.EmployeeWithEfficiency
import com.example.lab4.models.employee.Experience

data class Designer(
    override val baseSalary: Salary,
    override val experience: Experience,
    override val efficiency: Efficiency
): EmployeeWithEfficiency