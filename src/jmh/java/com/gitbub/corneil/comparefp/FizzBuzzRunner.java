package com.gitbub.corneil.comparefp;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.VerboseMode;

public class FizzBuzzRunner {
    public static void main(String[] args) throws RunnerException {
        System.setProperty("jmh.ignoreLock", "true");
        Options opt = new OptionsBuilder()
                    .include(".*" + FixBuzzBenchmark.class.getSimpleName() + ".*")
                    .verbosity(VerboseMode.EXTRA)
                    .warmupIterations(10)
                    .measurementIterations(10)
                    .forks(2)
                    .threads(1)
                    .build();
        new Runner(opt).run();
    }
}