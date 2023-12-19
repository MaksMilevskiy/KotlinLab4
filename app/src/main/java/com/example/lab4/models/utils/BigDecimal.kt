package com.example.lab4.models.utils

import java.math.BigDecimal

fun String.toBigDecimal(): BigDecimal {
    return BigDecimal(this)
}


fun Int.toBigDecimal(): BigDecimal {
    return this.toString().toBigDecimal()
}

interface BigDecimalValidator {
    companion object {
        fun validatePositive(value: BigDecimal) {
            require(value >= 0.toBigDecimal())
        }

        fun validateUnit(value: BigDecimal) {
            require(value >= 0.toBigDecimal())
            require(value <= 1.toBigDecimal())
        }
    }
}