package com.gitbub.corneil.comparefp;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.io.PrintWriter;
import java.io.StringWriter;

@State(value = Scope.Benchmark)
public class FixBuzzBenchmark {
    @Benchmark
    public void testImperative() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzImperative.imperative(blackhole);
    }
    @Benchmark
    public void testFunctional() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzFunctionalStreams.functionalStreams(blackhole);
    }
}
