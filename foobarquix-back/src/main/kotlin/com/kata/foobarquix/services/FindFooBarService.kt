package com.kata.foobarquix.services

import com.kata.foobarquix.services.constant.Constant.BAR
import com.kata.foobarquix.services.constant.Constant.FOO
import org.springframework.stereotype.Component

@Component
class FindFooBarService {

    fun execute(inputNumber: Int): StringBuilder {
        val numberToConvert = StringBuilder()

        if (inputNumber % 3 == 0) {
            numberToConvert.append(FOO)
        }

        if (inputNumber % 5 == 0) {
            numberToConvert.append(BAR)
        }
        return numberToConvert
    }
}
