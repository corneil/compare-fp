package com.gitbub.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzKotlinImperativeCall {
    companion object {
        inline fun fizzBuzz(i: Int) = when {
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i.toString()
        }

        @JvmStatic
        fun imperative(pw: PrintWriter) {
            for (i in 1..100) {
                pw.println(fizzBuzz(i))
            }
        }
    }
}