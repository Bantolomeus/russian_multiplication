package com.bantolomeus.russianMultiplication

class RussianMultiplication {

    fun multiply(factor1: Long, factor2: Long): Long {
        var factor1Rest = factor1
        var factor2Rest = factor2
        var result = 0L

        if (factor1Rest < 0) {
            factor1Rest = factor1Rest.times(-1)
        }
        if (factor2Rest < 0) {
            factor2Rest = factor2Rest.times(-1)
        }

        while (factor1Rest >= 1) {
            if (factor1Rest.rem(2L) != 0L){
                result += factor2Rest
            }
            factor2Rest = factor2Rest.times(2L)
            factor1Rest = factor1Rest.div(2)
        }

        return if (factor1 < 0 && factor2 > 0) {
            result.times(-1)
        } else if (factor2 < 0 && factor1 > 0){
            result.times(-1)
        } else {
            result
        }
    }
}
