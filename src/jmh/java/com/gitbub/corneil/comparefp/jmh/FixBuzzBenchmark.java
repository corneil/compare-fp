package com.gitbub.corneil.comparefp.jmh;

import com.gitbub.corneil.comparefp.FizzBuzzFunctional;
import com.gitbub.corneil.comparefp.FizzBuzzFunctionalMapReduce;
import com.gitbub.corneil.comparefp.FizzBuzzImperative;
import com.gitbub.corneil.comparefp.FizzBuzzKotlinFunctional;
import com.gitbub.corneil.comparefp.FizzBuzzKotlinImperative;
import com.github.corneil.comparefp.FizzBuzzGroovy;
import com.github.corneil.comparefp.FizzBuzzGroovyFunctional;
import com.github.corneil.comparefp.FizzBuzzScala;
import com.github.corneil.comparefp.FizzBuzzScalaImperative;
import com.github.corneil.comparefp.FizzBuzzScalaStreams;
import com.github.corneil.comparefp.FizzBuzzScalaZ;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.io.PrintWriter;

@State(value = Scope.Thread)
public class FixBuzzBenchmark {
    @Benchmark
    public void testGroovyFunctional() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzGroovyFunctional.functional(blackhole);
    }
    @Benchmark
    public void testGroovyImperative() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzGroovy.imperative(blackhole);
    }
    @Benchmark
    public void testJavaFunctional() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzFunctional.functional(blackhole);
    }
    @Benchmark
    public void testJavaFunctionalStreams() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzFunctionalMapReduce.functionalMapReduce(blackhole);
    }
    @Benchmark
    public void testJavaImperative() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzImperative.imperative(blackhole);
    }
    @Benchmark
    public void testKotlinFunctional() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzKotlinFunctional.functional(blackhole);
    }
    @Benchmark
    public void testKotlinImperative() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzKotlinImperative.imperative(blackhole);
    }
    @Benchmark
    public void testScalaFunctional() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzScala.functional(blackhole);
    }
    @Benchmark
    public void testScalaZFunctional() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzScalaZ.functional(blackhole);
    }
    @Benchmark
    public void testScalaFunctionalStreams() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzScalaStreams.functional(blackhole);
    }
    @Benchmark
    public void testScalaImperative() {
        PrintWriter blackhole = new NullPrintWriter();
        FizzBuzzScalaImperative.imperative(blackhole);
    }
}
