package com.gitbub.corneil.comparefp;

import java.io.PrintWriter;

public class FizzBuzzImperative {
    public static void imperative(PrintWriter writer) {
        for(int i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                writer.println("FizzBuzz");
            } else if (i % 3 == 0) {
                writer.println("Fizz");
            } else if (i % 5 == 0) {
                writer.println("Buzz");
            } else {
                writer.println(i);
            }
        }
    }
}
