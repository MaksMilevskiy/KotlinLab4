package com.example.lab4.models.salary

import com.example.lab4.models.employee.Employee
import com.example.lab4.models.employee.Salary

interface SalaryCalculator {
    fun getSalary(employee: Employee): Salary
}