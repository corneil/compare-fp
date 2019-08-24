package com.gitbub.corneil.comparefp;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class FizzBuzzFunctional {
    private static final List<Replacement> fizzBuzzRules =
            Collections.unmodifiableList(Arrays.asList(
                    new Replacement(i -> i % 15 == 0, "FizzBuzz"),
                    new Replacement(i -> i % 5 == 0, "Buzz"),
                    new Replacement(i -> i % 3 == 0, "Fizz")
            ));

    public static void functional(final PrintWriter writer) {
        Stream.iterate(1, i -> i + 1)
                .limit(100)
                .forEach(i -> writer.println(replace(i)));
    }

    private static String replace(final Integer i) {
        final Optional<Replacement> replacement = fizzBuzzRules.stream().filter(r -> r.when.test(i)).findFirst();
        return replacement.isPresent() ? replacement.get().output : i.toString();
    }

    private static class Replacement {
        final String output;
        final IntPredicate when;

        Replacement(IntPredicate when, String output) {
            this.output = output;
            this.when = when;
        }
    }
}
