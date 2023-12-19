package com.example.lab4.models.salary

import com.example.lab4.models.employee.Employee
import com.example.lab4.models.employee.Salary
import com.example.lab4.models.employee.type.Designer
import com.example.lab4.models.employee.type.Developer
import com.example.lab4.models.utils.toBigDecimal


class SalaryCalculatorTyped: SalaryCalculator {
    override fun getSalary(employee: Employee): Salary {
        return when (employee) {
            is Developer -> getDeveloperSalary(employee)
            is Designer -> getDesignerSalary(employee)
            else -> throw IllegalArgumentException("Unknown employee type")
        }
    }

    private fun getDeveloperSalary(developer: Developer): Salary {
        return getEmployeeSalary(developer)
    }

    private fun getDesignerSalary(designer: Designer): Salary {
        val countedSalary = getEmployeeSalary(designer).value
        val efficiency = designer.efficiency.value

        return Salary(countedSalary * efficiency)
    }

    private fun getEmployeeSalary(employee: Employee): Salary {
        val baseSalary = employee.baseSalary.value
        val experience = employee.experience.value
        val countedSalary = when {
            experience > 5.toBigDecimal() -> {
                baseSalary + 200.toBigDecimal()
            }
            experience > 2.toBigDecimal() -> {
                baseSalary * "1.2".toBigDecimal() + 200.toBigDecimal()
            }
            else -> baseSalary
        }

        return Salary(countedSalary)
    }
}