package com.gitbub.corneil.comparefp;

import com.github.corneil.comparefp.FizzBuzzScala;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.io.PrintWriter;

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
    @Benchmark
    public void testScalaImperative() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzScala.imperative(blackhole);
    }
    @Benchmark
    public void testScalaFunctional() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzScala.functional(blackhole);
    }
}
