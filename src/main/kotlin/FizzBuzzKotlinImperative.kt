package com.gitbub.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzKotlinImperative {
    companion object {
        @JvmStatic fun imperative(printWriter: PrintWriter) {
            for (i in 1..100) {
                when {
                    i % 15 == 0 -> printWriter.println("FizzBuzz")
                    i % 3 == 0 -> printWriter.println("Fizz")
                    i % 5 == 0 -> printWriter.println("Buzz")
                    else -> printWriter.println(i)
                }
            }
        }
    }
}