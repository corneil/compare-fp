package com.gitbub.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzKotlinFunctional {

    companion object {
        inline fun fizzOrBuzz(n: Int) = n % 3 == 0 || n % 5 == 0
        inline fun fizz(n: Int) = if (n % 3 == 0) "Fizz" else ""
        inline fun buzz(n: Int) = if (n % 5 == 0) "Buzz" else ""

        inline fun fizzBuzz(i: Int): String {
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
