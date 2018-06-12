package com.github.corneil.comparefp

/**
 * Created by Corneil on 2016/03/12.
 */
class FizzBuzzGroovyFunctional {
    static class Replacement {
        Closure when
        String output

        Replacement(Closure when, String output) {
            this.when = when
            this.output = output
        }
    }
    static fizzBuzzRules = [
            new Replacement({ it % 15 == 0 }, "FizzBuzz"),
            new Replacement({ it % 5 == 0 }, "Buzz"),
            new Replacement({ it % 3 == 0 }, "Fizz")
    ]

    static String replace(Integer i) {
        def r = fizzBuzzRules.find { it.when(i) }
        return r?.output ?: i.toString()
    }

    static functional(PrintWriter writer) {
        for (int i = 1; i <= 100; i++) {
            writer.println(replace(i))
        }
    }
}
