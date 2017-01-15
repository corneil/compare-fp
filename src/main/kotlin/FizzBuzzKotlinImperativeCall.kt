package com.gitbub.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzKotlinImperativeCall {
    companion object {
        fun replace(i: Int): String {
            when {
                i % 15 == 0 -> return "FizzBuzz"
                i % 3 == 0 -> return "Fizz"
                i % 5 == 0 -> return "Buzz"
                else -> return i.toString()
            }
        }

        @JvmStatic fun imperative(printWriter: PrintWriter) {
            for (i in 1..100) {
                printWriter.println(replace(i))
            }
        }
    }
}