package com.gitbub.corneil.comparefp.jmh;

import com.gitbub.corneil.comparefp.*;
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
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.io.PrintWriter;

@State(value = Scope.Thread)
public class FixBuzzBenchmark {
	private PrintWriter blackHole;

	@Setup
	public void setup() {
		blackHole = new NullPrintWriter();
	}

	@Benchmark
	public void testGroovyImperativeCall() {
		FizzBuzzGroovyCall.imperative(blackHole);
	}

	@Benchmark
	public void testGroovyImperativeInline() {
		FizzBuzzGroovy.imperative(blackHole);
	}

	@Benchmark
	public void testGroovyFunctional() {
		FizzBuzzGroovyFunctional.functional(blackHole);
	}

	@Benchmark
	public void testJavaFunctional() {
		FizzBuzzFunctional.functional(blackHole);
	}

	@Benchmark
	public void testJavaFunctionalVavr() {
		FizzBuzzFunctionalVavr.functional(blackHole);
	}

	@Benchmark
	public void testJavaFunctionalMapReduce() {
		FizzBuzzFunctionalMapReduce.functionalMapReduce(blackHole);
	}

	@Benchmark
	public void testJavaImperativeCall() {
		FizzBuzzImperativeCall.imperative(blackHole);
	}

	@Benchmark
	public void testJavaImperativeInline() {
		FizzBuzzImperative.imperative(blackHole);
	}

	@Benchmark
	public void testKotlinFunctional() {
		FizzBuzzKotlinFunctional.functional(blackHole);
	}

	@Benchmark
	public void testKotlinFunctionalMapReduce() {
		FizzBuzzKotlinFunctionalMapReduce.functional(blackHole);
	}

	@Benchmark
	public void testKotlinImperativeCall() {
		FizzBuzzKotlinImperativeCall.imperative(blackHole);
	}

	@Benchmark
	public void testKotlinImperativeInline() {
		FizzBuzzKotlinImperative.imperative(blackHole);
	}

	@Benchmark
	public void testScalaFunctional() {
		FizzBuzzScala.functional(blackHole);
	}

	@Benchmark
	public void testScalaFunctionalStreams() {
		FizzBuzzScalaStreams.functional(blackHole);
	}

	@Benchmark
	public void testScalaImperativeCall() {
		FizzBuzzScalaImperativeCall.imperativeCall(blackHole);
	}

	@Benchmark
	public void testScalaImperativeInline() {
		FizzBuzzScalaImperative.imperativeInline(blackHole);
	}

	@Benchmark
	public void testScalaZFunctional() {
		FizzBuzzScalaZ.functional(blackHole);
	}
}
