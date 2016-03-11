package io.jumpco.demos.comparefp;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(value = Scope.Benchmark)
public class FixBuzzBenchmark {
    @Benchmark
    public void testImperative() {
        FizzBuzzImperative.imperative(1000);
    }
    @Benchmark
    public void testFunctional() {
        FizzBuzzFunctionalStreams.functionalStreams(1000);
    }
}
