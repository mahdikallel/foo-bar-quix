package com.kata.foobarquix.services

import com.kata.foobarquix.services.constant.Constant.EMPTY_STRING
import com.kata.foobarquix.services.constant.Constant.fooBarQuixMap
import org.springframework.stereotype.Component
import java.util.stream.Collectors


@Component
class FooBarQuixService(private val divisibleConvertor: DivisibleConvertor) {

    fun convertNumber(inputNumber: Int): String {
        val numberToConvert = StringBuilder()
        numberToConvert
                .append(divisibleConvertor.execute(inputNumber))
                .append(inputNumber.toString()
                        .chars()
                        .mapToObj { convert(it.toChar()) }
                        .collect(Collectors.joining()))

        return if (numberToConvert.isEmpty()) inputNumber.toString() else numberToConvert.toString()
    }

    private fun convert(s: Char): String {
        return fooBarQuixMap.getOrDefault(s.toString(), EMPTY_STRING)
    }

}
