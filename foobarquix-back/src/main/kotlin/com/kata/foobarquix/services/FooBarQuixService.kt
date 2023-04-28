package com.kata.foobarquix.services

import org.springframework.stereotype.Component

private const val FOO = "Foo"
private const val BAR = "Bar"
private const val QUIX = "Quix"

private const val THREE = "3"
private const val FIVE = "5"
private const val SEVEN = "7"

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        val numberToConvert = StringBuilder();

        if (inputNumber % 3 == 0) {
            numberToConvert.append(FOO);
        }

        if (inputNumber % 5 == 0) {
            numberToConvert.append(BAR);
        }


        for (s in inputNumber.toString().iterator()) {
            if (s.toString() == THREE) {
                numberToConvert.append(FOO)
            }
            if (s.toString() == FIVE) {
                numberToConvert.append(BAR)
            }
            if (s.toString() == SEVEN) {
                numberToConvert.append(QUIX)
            }
        }

        val result = numberToConvert.toString()
        return if (result.isEmpty()) inputNumber.toString() else result;
    }

}
