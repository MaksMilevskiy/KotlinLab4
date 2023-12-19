package com.example.lab4.models.employee.type

import com.example.lab4.models.employee.Salary
import com.example.lab4.models.employee.Employee
import com.example.lab4.models.employee.Experience

data class Developer(
    override val baseSalary: Salary,
    override val experience: Experience
): Employee