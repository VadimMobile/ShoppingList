package calculator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class CalculatorTest{

    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun `When 5 Add To 10 Then Result 15`(calculator: Calculator){
        val result = calculator.sum(10,5)
        val expected = 15
        assertEquals(expected, result)
    }

    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun `When 105 Add To 55 Then Result 160`(calculator: Calculator){
        val result = calculator.sum(105,55)
        val expected = 160
        assertEquals(expected, result)
    }
    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun `When 10 division To 5 Then Result 2`(calculator: Calculator){
        val result = calculator.division(10,5)
        val expected = 2
        assertEquals(expected, result)
    }
    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun `When 100 division To 10 Then Result 10`(calculator: Calculator){
        val result = calculator.division(100,10)
        val expected = 10
        assertEquals(expected, result)
    }
    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun `When 5 multiplication To 10 Then Result 50`(calculator: Calculator){
        val result = calculator.multiplication(5,10)
        val expected = 50
        assertEquals(expected, result)
    }
    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun `When 15 multiplication To 3 Then Result 45`(calculator: Calculator){
        val result = calculator.multiplication(15,3)
        val expected = 45
        assertEquals(expected, result)
    }
    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun `When 10 subtraction To 5 Then Result 5`(calculator: Calculator){
        val result = calculator.subtraction(10,5)
        val expected = 5
        assertEquals(expected, result)
    }
    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun `When 15 subtraction To 5 Then Result 10`(calculator: Calculator){
        val result = calculator.subtraction(15,5)
        val expected = 10
        assertEquals(expected, result)
    }
    companion object {
        @JvmStatic
        fun calculatorSource() = listOf(SimpleCalculator(), LoggingCalculator())
    }
}