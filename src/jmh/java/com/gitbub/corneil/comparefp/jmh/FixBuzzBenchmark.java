package com.gitbub.corneil.comparefp.jmh;

import com.gitbub.corneil.comparefp.FizzBuzzFunctional;
import com.gitbub.corneil.comparefp.FizzBuzzFunctionalMapReduce;
import com.gitbub.corneil.comparefp.FizzBuzzImperative;
import com.gitbub.corneil.comparefp.FizzBuzzImperativeCall;
import com.gitbub.corneil.comparefp.FizzBuzzKotlinFunctional;
import com.gitbub.corneil.comparefp.FizzBuzzKotlinImperative;
import com.gitbub.corneil.comparefp.FizzBuzzKotlinImperativeCall;
import com.github.corneil.comparefp.FizzBuzzGroovy;
import com.github.corneil.comparefp.FizzBuzzGroovyCall;
import com.github.corneil.comparefp.FizzBuzzGroovyFunctional;
import com.github.corneil.comparefp.FizzBuzzScala;
import com.github.corneil.comparefp.FizzBuzzScalaImperative;
import com.github.corneil.comparefp.FizzBuzzScalaImperativeCall;
import com.github.corneil.comparefp.FizzBuzzScalaStreams;
import com.github.corneil.comparefp.FizzBuzzScalaZ;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.io.PrintWriter;

@State(value = Scope.Thread)
public class FixBuzzBenchmark {
    @Benchmark
    public void testJavaImperativeInline() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzImperative.imperative(blackHole);
    }
    @Benchmark
    public void testGroovyImperativeInline() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzGroovy.imperative(blackHole);
    }
    @Benchmark
    public void testKotlinImperativeInline() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzKotlinImperative.imperative(blackHole);
    }
    @Benchmark
    public void testScalaImperativeInline() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzScalaImperative.imperativeInline(blackHole);
    }
    @Benchmark
    public void testJavaImperativeCall() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzImperativeCall.imperative(blackHole);
    }
    @Benchmark
    public void testGroovyImperativeCall() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzGroovyCall.imperative(blackHole);
    }
    @Benchmark
    public void testKotlinImperativeCall() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzKotlinImperativeCall.imperative(blackHole);
    }
    @Benchmark
    public void testScalaImperativeCall() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzScalaImperativeCall.imperativeCall(blackHole);
    }
    @Benchmark
    public void testGroovyFunctional() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzGroovyFunctional.functional(blackHole);
    }
    @Benchmark
    public void testJavaFunctional() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzFunctional.functional(blackHole);
    }

    @Benchmark
    public void testJavaFunctionalMapReduce() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzFunctionalMapReduce.functionalMapReduce(blackHole);
    }

    @Benchmark
    public void testKotlinFunctional() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzKotlinFunctional.functional(blackHole);
    }
    @Benchmark
    public void testScalaFunctional() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzScala.functional(blackHole);
    }
    @Benchmark
    public void testScalaZFunctional() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzScalaZ.functional(blackHole);
    }
    @Benchmark
    public void testScalaFunctionalStreams() {
        PrintWriter blackHole = new NullPrintWriter();
        FizzBuzzScalaStreams.functional(blackHole);
    }
}
