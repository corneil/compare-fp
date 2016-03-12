package com.gitbub.corneil.comparefp;

import com.github.corneil.comparefp.FizzBuzzScala;
import com.github.corneil.comparefp.FizzBuzzScalaImperative;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void testFunctionalStreams() {
        StringWriter output = new StringWriter();
        PrintWriter writer = new PrintWriter(output);
        FizzBuzzFunctionalStreams.functionalStreams(writer);
        writer.flush();
        verifyOutput(output.toString());
    }
    @Test
    public void testImperative() {
        StringWriter output = new StringWriter();
        PrintWriter writer = new PrintWriter(output);
        FizzBuzzImperative.imperative(writer);
        writer.flush();
        verifyOutput(output.toString());
    }
    @Test
    public void testScalaImperative() {
        StringWriter output = new StringWriter();
        PrintWriter writer = new PrintWriter(output);
        FizzBuzzScalaImperative.imperative(writer);
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
    private void verifyOutput(final String result) {

        assertTrue(result.contains("1" + System.lineSeparator() + "2" + System.lineSeparator() + "Fizz" + System.lineSeparator()));
        assertTrue(result.contains(System.lineSeparator() + "98" + System.lineSeparator() + "Fizz" + System.lineSeparator() + "Buzz"));
        assertTrue(result.contains("Fizz"));
        assertTrue(result.contains("FizzBuzz"));
        assertTrue(result.contains("Buzz"));
        assertTrue(result.contains(System.lineSeparator() + "14" + System.lineSeparator()));

        assertFalse(result.contains("0" + System.lineSeparator() + "1" + System.lineSeparator()));
        assertFalse(result.contains("BuzzFizz"));
        assertFalse(result.contains(System.lineSeparator() + "99"));
        assertFalse(result.contains(System.lineSeparator() + "15" + System.lineSeparator()));
        assertFalse(result.contains(System.lineSeparator() + "18" + System.lineSeparator()));
        assertFalse(result.contains(System.lineSeparator() + "3" + System.lineSeparator()));
    }
}
