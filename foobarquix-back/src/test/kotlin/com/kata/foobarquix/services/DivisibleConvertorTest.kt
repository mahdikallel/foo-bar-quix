package com.kata.foobarquix.services

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DivisibleConvertorTest {

    private val divisibleConvertor: DivisibleConvertor = DivisibleConvertor()

    @Test
    fun should_return_foo_when_number_is_divisible_by_3() {
        // given
        val numberToConvert = 21

        // when
        val convertedNumber = divisibleConvertor.execute(numberToConvert)

        // then
        Assertions.assertEquals("Foo", convertedNumber.toString())
    }


    @Test
    fun should_return_bar_when_number_is_divisible_by_5() {
        // given
        val numberToConvert = 25

        // when
        val convertedNumber = divisibleConvertor.execute(numberToConvert)

        // then
        Assertions.assertEquals("Bar", convertedNumber.toString())
    }

    @Test
    fun should_return_foobar_when_number_is_divisible_by_3_and_5_respectively() {
        // given
        val numberToConvert = 15

        // when
        val convertedNumber = divisibleConvertor.execute(numberToConvert)

        // then
        Assertions.assertEquals("FooBar", convertedNumber.toString())
    }
}
