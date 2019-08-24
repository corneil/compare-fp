package com.gitbub.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzKotlinFunctionalMapReduce {

    companion object {
        data class Replacement(val rule: (Int) -> Boolean, val output: String)

        private val fizzBuzzRules = listOf(
                Replacement({ i -> i % 3 == 0 }, "Fizz"),
                Replacement({ i -> i % 5 == 0 }, "Buzz")
        )

        private fun fizzBuzz(i: Int): String {
            val rules = fizzBuzzRules.filter { r -> r.rule(i) }.map { r -> r.output }
            return if (rules.isEmpty()) i.toString()
                    else rules.reduce { acc, s -> acc + s }
        }


        @JvmStatic
        fun functional(pw: PrintWriter) {
            for (i in 1..100) {
                pw.println(fizzBuzz(i))
            }
        }
    }
}
