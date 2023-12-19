package com.example.lab4.models.employee

import com.example.lab4.models.utils.BigDecimalValidator
import com.example.lab4.models.utils.ValidatableLambda
import java.math.BigDecimal

data class Experience(val value: BigDecimal) {
    init {
        validate(value)
    }

    companion object: ValidatableLambda<BigDecimal>(BigDecimalValidator::validatePositive)
}