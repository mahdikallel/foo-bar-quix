package com.kata.foobarquix.services

import com.kata.foobarquix.services.constant.Constant.EMPTY_STRING
import com.kata.foobarquix.services.constant.Constant.fooBarQuixMap
import org.springframework.stereotype.Component


@Component
class FooBarQuixService(private val findFooBarService: FindFooBarService) {

    fun convertNumber(inputNumber: Int): String {
        val numberToConvert = findFooBarService.execute(inputNumber)
        for (s in inputNumber.toString().iterator()) {
            numberToConvert.append(convert(s))
        }
        return if (numberToConvert.isEmpty()) inputNumber.toString() else numberToConvert.toString()
    }

    private fun convert(s: Char): String {
        return fooBarQuixMap.getOrDefault(s.toString(), EMPTY_STRING)
    }

}
