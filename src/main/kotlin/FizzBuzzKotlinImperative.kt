package com.gitbub.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzKotlinImperative {
    companion object {
        @JvmStatic fun imperative(pw: PrintWriter) {
            for (i in 1..100) {
                when {
                    i % 15 == 0 -> pw.println("FizzBuzz")
                    i % 3 == 0 -> pw.println("Fizz")
                    i % 5 == 0 -> pw.println("Buzz")
                    else -> pw.println(i)
                }
            }
        }
    }
}