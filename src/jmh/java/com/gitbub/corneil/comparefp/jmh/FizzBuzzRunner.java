package com.gitbub.corneil.comparefp.jmh;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import org.openjdk.jmh.runner.options.VerboseMode;

public class FizzBuzzRunner {
    public static void main(String[] args) throws RunnerException {
        System.setProperty("jmh.ignoreLock", "true");
        Options opt = new OptionsBuilder()
                .include(".*" + FizzBuzzBenchmark.class.getSimpleName() + ".*")
                .verbosity(VerboseMode.EXTRA)
                .warmupIterations(3)
                .measurementIterations(5)
                .warmupTime(TimeValue.seconds(3))
                .measurementTime(TimeValue.seconds(5))
                .mode(Mode.Throughput)
                .output("results.txt")
                .result("results.csv")
                .resultFormat(ResultFormatType.CSV)
                // .jvmArgsPrepend("-XX:+AggressiveOpts")
                .forks(0)
                .threads(1)
                .build();
        new Runner(opt).run();
    }
}
