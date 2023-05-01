package com.kata.foobarquix.services.constant

object Constant {
    const val FOO = "Foo"
    const val BAR = "Bar"
    const val QUIX = "Quix"

    const val THREE = "3"
    const val FIVE = "5"
    const val SEVEN = "7"

    const val EMPTY_STRING = ""


    val fooBarQuixMap: HashMap<String, String> = hashMapOf(
            THREE to FOO,
            FIVE to BAR,
            SEVEN to QUIX
    )
}
