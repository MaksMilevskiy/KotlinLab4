package com.example.lab4.models.employee

import com.example.lab4.models.employee.Efficiency

interface EmployeeWithEfficiency: Employee {
    val efficiency: Efficiency
}