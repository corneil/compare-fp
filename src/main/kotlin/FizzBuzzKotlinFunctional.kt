package com.gitbub.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzKotlinFunctional {

    companion object {
        private inline fun fizzOrBuzz(n: Int) = n % 3 == 0 || n % 5 == 0
        private inline fun fizz(n: Int) = if (n % 3 == 0) "Fizz" else ""
        private inline fun buzz(n: Int) = if (n % 5 == 0) "Buzz" else ""

        private inline fun fizzBuzz(i: Int): String {
            return if (fizzOrBuzz(i)) fizz(i) + buzz(i) else i.toString()
        }

        @JvmStatic
        fun functional(pw: PrintWriter) {
            for (i in 1..100) {
                pw.println(fizzBuzz(i))
            }
        }
    }
}
