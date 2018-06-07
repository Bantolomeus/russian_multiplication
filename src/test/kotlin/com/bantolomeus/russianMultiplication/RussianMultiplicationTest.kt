package com.bantolomeus.russianMultiplication

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class RussianMultiplicationTest {

    private val russianMultiplication = RussianMultiplication()

    @Test
    fun simpleMultiplication(){
        val factor1 = 2L
        val factor2 = 2L
        val expectedResult: Long = factor1 * factor2
        val actualResult = russianMultiplication.multiply(factor1, factor2)

        Assert.assertEquals(expectedResult,actualResult)
    }

    @Test
    fun simpleMultiplication2(){
        val factor1 = 42L
        val factor2 = 42L
        val expectedResult: Long = factor1 * factor2
        val actualResult = russianMultiplication.multiply(factor1, factor2)

        Assert.assertEquals(expectedResult,actualResult)
    }

    @Test
    fun hardMultiplication(){
        val factor1 = 25L
        val factor2 = 12L
        val expectedResult: Long = factor1 * factor2
        val actualResult = russianMultiplication.multiply(factor1, factor2)

        Assert.assertEquals(expectedResult,actualResult)
    }

    @Test
    fun firstOneMinusMultiplication(){
        val factor1 = -2L
        val factor2 = 2L
        val expectedResult: Long = factor1 * factor2
        val actualResult = russianMultiplication.multiply(factor1, factor2)

        Assert.assertEquals(expectedResult,actualResult)
    }

    @Test
    fun secondOneMinusMultiplication(){
        val factor1 = 2L
        val factor2 = -2L
        val expectedResult: Long = factor1 * factor2
        val actualResult = russianMultiplication.multiply(factor1, factor2)

        Assert.assertEquals(expectedResult,actualResult)
    }

    @Test
    fun bothMinusMultiplication(){
        val factor1 = -2L
        val factor2 = -2L
        val expectedResult: Long = factor1 * factor2
        val actualResult = russianMultiplication.multiply(factor1, factor2)

        Assert.assertEquals(expectedResult,actualResult)
    }
}
