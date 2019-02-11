package de.stf.test

import main.kotlin.de.stf.test.HelperClass

fun main(args: Array<String>) {
    HelperUser(5).callHelper()
}

class HelperUser(
    val amount: Int)
{
    fun callHelper() {
        (0..amount).forEach {
            HelperClass.doit("call #$it")
        }
    }
}

