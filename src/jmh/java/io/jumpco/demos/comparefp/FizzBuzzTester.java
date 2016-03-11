package io.jumpco.demos.comparefp;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class FizzBuzzTester {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                    .include(".*" + FixBuzzBenchmark.class.getSimpleName() + ".*")
                    .warmupIterations(10)
                    .measurementIterations(10)
                    .forks(2)
                    .build();
        new Runner(opt).run();
    }
}