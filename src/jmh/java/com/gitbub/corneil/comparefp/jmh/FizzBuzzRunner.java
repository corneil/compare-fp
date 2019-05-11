package com.gitbub.corneil.comparefp.jmh;

import org.openjdk.jmh.annotations.Mode;
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
                .warmupIterations(5)
                .measurementIterations(5)
                .mode(Mode.Throughput)
                .jvmArgsPrepend("-XX:+AggressiveOpts")
                .forks(1)
                .threads(1)
                .build();
        new Runner(opt).run();
    }
}