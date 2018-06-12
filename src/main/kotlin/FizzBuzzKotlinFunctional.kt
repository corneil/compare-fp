package com.gitbub.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzKotlinFunctional {

    companion object {
        data class Replacement(val rule: (Int) -> Boolean, val output: String)

        private val fizzBuzzRules = listOf(
                Replacement({ i -> i % 15 == 0 }, "FizzBuzz"),
                Replacement({ i -> i % 3 == 0 }, "Fizz"),
                Replacement({ i -> i % 5 == 0 }, "Buzz")
        )

        fun replace(i: Int): String {
            val result = fizzBuzzRules.firstOrNull { r -> r.rule(i) }
            return result?.output ?: i.toString()
        }

        @JvmStatic
        fun functional(pw: PrintWriter) {
            for (i in 1..100) {
                pw.println(replace(i))
            }
        }
    }
}
