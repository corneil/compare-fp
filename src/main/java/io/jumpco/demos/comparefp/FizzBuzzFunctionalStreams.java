package io.jumpco.demos.comparefp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzFunctionalStreams {
    static Predicate<Integer> divisibleBy(Integer div) {
        return (i) -> i % div == 0;
    }
    static class Replacement {
        final Predicate<Integer> when;
        final String output;
        Replacement(Predicate<Integer> when, String output) {
            this.output = output;
            this.when = when;
        }
    }

    static List<Replacement> fizzAndOrBuzz =
            Collections.unmodifiableList(
                Arrays.asList(
                    new Replacement(divisibleBy(3), "Fizz"),
                    new Replacement(divisibleBy(5), "Buzz")
                )
            );
    static String replace(final Integer i, final List<Replacement> rules) {
        return rules.stream()
                    .filter(replacement -> replacement.when.test(i))
                    .map(replacement -> replacement.output)
                    .reduce(String::concat)
                    .orElse(Integer.toString(i));
    }
    static String fizzBuzz(final Integer i) {
        return replace(i, fizzAndOrBuzz);
    }
    public static List<String> functionalStreams(int max) {
        return IntStream.range(0, max)
                        .mapToObj(FizzBuzzFunctionalStreams::fizzBuzz)
                        .collect(Collectors.toList());
    }
}
