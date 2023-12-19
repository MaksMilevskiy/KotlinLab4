package com.example.lab4.models.employee

import com.example.lab4.models.employee.Salary
import com.example.lab4.models.employee.Experience

interface Employee {
    val baseSalary: Salary
    val experience: Experience
}