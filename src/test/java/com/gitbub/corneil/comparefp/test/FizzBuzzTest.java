package com.gitbub.corneil.comparefp.test;

import com.gitbub.corneil.comparefp.FizzBuzzFunctional;
import com.gitbub.corneil.comparefp.FizzBuzzFunctionalMapReduce;
import com.gitbub.corneil.comparefp.FizzBuzzFunctionalVavr;
import com.gitbub.corneil.comparefp.FizzBuzzImperative;
import com.gitbub.corneil.comparefp.FizzBuzzImperativeCall;
import com.gitbub.corneil.comparefp.FizzBuzzKotlinFunctional;
import com.gitbub.corneil.comparefp.FizzBuzzKotlinFunctionalMapReduce;
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
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class FizzBuzzTest {
	@Test
	public void testKotlinImperativeInline() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzKotlinImperative.imperative(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testKotlinImperativeCall() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzKotlinImperativeCall.imperative(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testKotlinFunctional() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzKotlinFunctional.functional(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testKotlinFunctionalMapReduce() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzKotlinFunctionalMapReduce.functional(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testJavaFunctionalMapReduce() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzFunctionalMapReduce.functionalMapReduce(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testJavaFunctionalVavr() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzFunctionalVavr.functional(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testJavaFunctional() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzFunctional.functional(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testJavaImperativeInline() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzImperative.imperative(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testJavaImperativeCall() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzImperativeCall.imperative(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testGroovyImperativeInline() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzGroovy.imperative(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testGroovyImperativeCall() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzGroovyCall.imperative(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testGroovyFunctional() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzGroovyFunctional.functional(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testScalaImperativeInline() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzScalaImperative.imperativeInline(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testScalaImperativeCall() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzScalaImperativeCall.imperativeCall(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testScalaFunctional() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzScala.functional(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testScalaZFunctional() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzScalaZ.functional(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	@Test
	public void testScalaFunctionalStreams() {
		StringWriter output = new StringWriter();
		PrintWriter writer = new PrintWriter(output);
		FizzBuzzScalaStreams.functional(writer);
		writer.flush();
		verifyOutput(output.toString());
	}

	private void verifyOutput(final String result) {

		assertTrue("first few incorrect", result.contains("1" + System.lineSeparator() + "2" + System.lineSeparator() + "Fizz" + System.lineSeparator()));
		assertTrue("No Fizz", result.contains("Fizz"));
		assertTrue("No FizzBuzz", result.contains("FizzBuzz"));
		assertTrue("No Buzz", result.contains("Buzz"));
		assertTrue("Probably not doing up to 100", result.contains(System.lineSeparator() + "98" + System.lineSeparator() + "Fizz" + System.lineSeparator() + "Buzz"));
		assertTrue(result.contains(System.lineSeparator() + "14" + System.lineSeparator()));

		assertFalse(result.contains("0" + System.lineSeparator() + "1" + System.lineSeparator()));
		assertFalse(result.contains("BuzzFizz"));
		assertFalse(result.contains(System.lineSeparator() + "99"));
		assertFalse(result.contains(System.lineSeparator() + "15" + System.lineSeparator()));
		assertFalse(result.contains(System.lineSeparator() + "18" + System.lineSeparator()));
		assertFalse(result.contains(System.lineSeparator() + "3" + System.lineSeparator()));
	}
}
