package com.gitbub.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzKotlinFunctionalMapReduce {

    companion object {
        data class Replacement(val rule: (Int) -> Boolean, val output: String)

        private val fizzBuzzRules = listOf(
                Replacement({ i -> i % 3 == 0 }, "Fizz"),
                Replacement({ i -> i % 5 == 0 }, "Buzz")
        )

        fun replace(i: Int, replacements: List<Replacement>): String {
            val items = replacements.filter { r -> r.rule(i) }.map { r -> r.output }
            return if (items.isEmpty()) {
                i.toString()
            } else {
                items.reduce { a, s -> a + s }
            }
        }

        @JvmStatic
        fun functional(pw: PrintWriter) {
            for (i in 1..100) {
                pw.println(replace(i, fizzBuzzRules))
            }
        }
    }
}