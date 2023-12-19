package com.example.lab4.models.employee

import com.example.lab4.models.utils.toBigDecimal

enum class SalaryCategory {
    JUNIOR, MIDDLE, SENIOR, OLIGARCH;

    companion object {
        fun forSalary(salary: Salary): SalaryCategory {
            return when {
                salary.value <= 1000.toBigDecimal() -> JUNIOR
                salary.value <= 2000.toBigDecimal() -> MIDDLE
                salary.value <= 3000.toBigDecimal() -> SENIOR
                else -> OLIGARCH
            }
        }
    }
}