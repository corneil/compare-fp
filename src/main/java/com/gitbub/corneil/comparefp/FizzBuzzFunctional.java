package com.gitbub.corneil.comparefp;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FizzBuzzFunctional {
    private static final List<Replacement> fizzAndOrBuzz =
            Collections.unmodifiableList(Arrays.asList(
                    new Replacement(i -> i % 15 == 0, "FizzBuzz"),
                    new Replacement(i -> i % 3 == 0, "Fizz"),
                    new Replacement(i -> i % 5 == 0, "Buzz")
            ));

    public static void functional(final PrintWriter writer) {
        for (int i = 1; i <= 100; i++) {
            writer.println(replace(i, fizzAndOrBuzz));
        }
    }

    private static String replace(final Integer i, final List<Replacement> rules) {
        final Optional<Replacement> replacement = rules.stream()
                .filter(r -> r.when.test(i)).findFirst();
        return replacement.isPresent() ? replacement.get().output : i.toString();
    }

    private static class Replacement {
        final String output;
        final Predicate<Integer> when;

        Replacement(Predicate<Integer> when, String output) {
            this.output = output;
            this.when = when;
        }
    }
}
