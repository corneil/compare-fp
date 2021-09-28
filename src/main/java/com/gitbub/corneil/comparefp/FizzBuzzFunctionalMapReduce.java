package com.gitbub.corneil.comparefp;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FizzBuzzFunctionalMapReduce {
    private static final List<Replacement> fizzBuzzRules =
            List.of(new Replacement(i -> i % 3 == 0, "Fizz"),
                    new Replacement(i -> i % 5 == 0, "Buzz"));

    private static String fizzBuzz(final Integer i) {
        return replace(i);
    }

    private static String replace(final Integer i) {
        return fizzBuzzRules.stream()
                .filter(r -> r.when.test(i))
                .map(r -> r.output)
                .reduce((s1, s2) -> s1 + s2)
                .orElse(i.toString());
    }

    public static void functionalMapReduce(final PrintWriter writer) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(FizzBuzzFunctionalMapReduce::fizzBuzz)
                .forEach(writer::println);
    }

    private static class Replacement {
        final IntPredicate when;
        final String output;

        Replacement(IntPredicate when, String output) {
            this.output = output;
            this.when = when;
        }
    }
}
