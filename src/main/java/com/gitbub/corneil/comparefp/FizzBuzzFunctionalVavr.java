package com.gitbub.corneil.comparefp;


import io.vavr.collection.List;

import java.io.PrintWriter;
import java.util.function.Predicate;


public class FizzBuzzFunctionalVavr {
	private static final List<Replacement> fizzBuzzRules =
		List.of(
			new Replacement(i -> i % 15 == 0, "FizzBuzz"),
			new Replacement(i -> i % 3 == 0, "Fizz"),
			new Replacement(i -> i % 5 == 0, "Buzz")
		);

	public static void functional(final PrintWriter writer) {
		List.range(1, 101)
			.forEach(i -> writer.println(replace(i)));
	}

	private static String replace(final Integer i) {
		return fizzBuzzRules.find(r -> r.when.test(i))
			.map(r -> r.output)
			.getOrElse(i.toString());
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
