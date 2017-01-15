package com.github.corneil.comparefp

import groovy.transform.CompileStatic

@CompileStatic
class FizzBuzzGroovyCall {
    static String replace(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz"
        } else if (i % 3 == 0) {
            return "Fizz"
        } else if (i % 5 == 0) {
            return "Buzz"
        } else {
            return Integer.toString(i)
        }
    }
    static imperative(PrintWriter writer) {
        for(int i = 1; i <= 100; i++) {
            writer.println(replace(i))
        }
    }
}
