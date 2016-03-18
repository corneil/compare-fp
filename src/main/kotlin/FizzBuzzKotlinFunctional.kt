package com.gitbub.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzKotlinFunctional {

    companion object {
        class Replacement(r: (Int) -> Boolean, o: String) {
            val rule: (Int) -> Boolean = r
            val output: String = o
        }

        val fizzBuzzRules = listOf(
                Replacement({ i -> i % 15 == 0 }, "FizzBuzz"),
                Replacement({ i -> i % 3 == 0 }, "Fizz"),
                Replacement({ i -> i % 5 == 0 }, "Buzz")
        )

        fun replace(i: Int, replacements: List<Replacement>): String {
            val result: Replacement? = replacements.firstOrNull { r -> r.rule(i) }
            return result?.output ?: i.toString()
        }

        @JvmStatic fun functional(printWriter: PrintWriter) {
            for (i in 1..100) {
                printWriter.println(replace(i, fizzBuzzRules))
            }
        }
    }
}
