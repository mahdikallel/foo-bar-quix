package com.kata.foobarquix.services

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class FooBarQuixServiceTest {

    private val fooBarQuixService: FooBarQuixService = FooBarQuixService();

    @Test
    fun should_return_foofoo_when_number_is_divisible_by_3_or_contain_3() {
        // given
        val numberToConvert: Int = 3

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("FooFoo", convertedNumber)
    }

    @Test
    fun should_return_foo_when_number_is_divisible_by_3() {
        // given
        val numberToConvert: Int = 9

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("Foo", convertedNumber)
    }


    @Test
    fun should_return_BarBar_when_number_is_divisible_by_5_or_contain_5() {
        // given
        val numberToConvert: Int = 5

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("BarBar", convertedNumber)
    }

    @Test
    fun should_return_Quix_when_number_contain_7() {
        // given
        val numberToConvert: Int = 7

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("Quix", convertedNumber)
    }


    @Test
    fun should_return_FooBar_when_number_is_divisible_by_3_and_contain_5() {
        // given
        val numberToConvert: Int = 51

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("FooBar", convertedNumber)
    }

    @Test
    fun should_return_BarFoo_when_number_is_divisible_by_3_and_contain_5() {
        // given
        val numberToConvert: Int = 53

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("BarFoo", convertedNumber)
    }

    @Test
    fun should_return_FooFooFoo_when_number_is_divisible_by_3_and_contain_5() {
        // given
        val numberToConvert: Int = 33

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("FooFooFoo", convertedNumber)
    }


    @Test
    fun should_return_FooQuix_when_number_is_divisible_by_3_and_contain_5() {
        // given
        val numberToConvert: Int = 27

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("FooQuix", convertedNumber)
    }


    @Test
    fun should_return_FooBarBar_when_number_is_divisible_by_3_and_contain_5() {
        // given
        val numberToConvert: Int = 15

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("FooBarBar", convertedNumber)
    }

    @Test
    fun should_return_same_number_when_no_case_matches() {
        // given
        val numberToConvert: Int = 14

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("14", convertedNumber)
    }


    @Test
    fun should_return_BarFooBar_same_number_when_number_divisible_by_5_and_contain_3() {
        // given
        val numberToConvert: Int = 305

        // when
        val convertedNumber = fooBarQuixService.convertNumber(numberToConvert)

        // then
        Assertions.assertEquals("BarFooBar", convertedNumber)
    }

}
