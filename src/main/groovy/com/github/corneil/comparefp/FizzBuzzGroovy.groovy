package com.github.corneil.comparefp

import groovy.transform.CompileStatic

@CompileStatic
class FizzBuzzGroovy {
    def static imperative(PrintWriter writer) {
        for(int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                writer.println("FizzBuzz")
            } else if (i % 3 == 0) {
                writer.println("Fizz")
            } else if (i % 5 == 0) {
                writer.println("Buzz")
            } else {
                writer.println(i)
            }
        }
    }
}
