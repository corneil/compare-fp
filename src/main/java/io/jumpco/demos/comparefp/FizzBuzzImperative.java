package io.jumpco.demos.comparefp;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzImperative {
    public static List<String> imperative(int max) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
