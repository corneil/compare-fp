# Comparing Functional and Imperative performance

During a recent talk on programming paradigms [Pavel Tcholakov](https://twitter.com/pavletko) presented an example using
Java 8 streams to solve the classic FizzBuzz problem.

> Write a program that prints the numbers from 1 to 100.
  But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
  For numbers which are multiples of both three and five print “FizzBuzz”.

Here is a little project to compare the performance of imperative and functional programming.

The [jmh gradle plugin](https://github.com/melix/jmh-gradle-plugin) was a great discovery.


The numbers on Intel Core<sup>TM</sup> i7 2.5Ghz

|Benchmark | Mode | Cnt | Score|Error|Units|
|----------|------|----:|-----:|----:|-----|
| FixBuzzBenchmark.testFunctional     | thrpt | 50 |  61090.872 | ±  1798.539 | ops/s|
| FixBuzzBenchmark.testImperative     | thrpt | 50 | 182779.152 | ±  3148.576 | ops/s|

After using the `NullPrintWriter` in the benchmark.

|Benchmark | Mode | Cnt | Score|Error|Units|
|----------|------|----:|-----:|----:|-----|
|FixBuzzBenchmark.testFunctional     | thrpt | 25 |   78407.583 | ±  3516.310 | ops/s|
|FixBuzzBenchmark.testImperative     | thrpt | 25 | 3023374.318 | ± 94278.341 | ops/s|

## Changelog
* Added [Scala](http://www.scala-lang.org) versions.
* Added [Groovy](http://www.groovy-lang.org) versions.
* Created Java functional that doesn't perform map/reduce.
* Refactored Scala version to similar functional without map/reduce.
* Added [Kotlin](https://kotlinlang.org) versions

## Groovy Results
|Benchmark | Mode | Cnt | Score|Error|Units|
|----------|------|----:|-----:|----:|-----|
|FixBuzzBenchmark.testGroovyFunctional      | thrpt |  50 |   11903.295 | ±    269.842 | ops/s |
|FixBuzzBenchmark.testGroovyImperative      | thrpt |  50 | 2965120.814 | ± 110144.919 | ops/s |

## Java Results
|Benchmark | Mode | Cnt | Score|Error|Units|
|----------|------|----:|-----:|----:|-----|
|FixBuzzBenchmark.testJavaFunctional        | thrpt |  50 |  110031.245 | ±   2845.457 | ops/s |
|FixBuzzBenchmark.testJavaFunctionalStreams | thrpt |  50 |   78164.119 | ±   2859.085 | ops/s |
|FixBuzzBenchmark.testJavaImperative        | thrpt |  50 | 3060987.580 | ±  65957.279 | ops/s |

## Scala Results
|Benchmark | Mode | Cnt | Score|Error|Units|
|----------|------|----:|-----:|----:|-----|
|FixBuzzBenchmark.testScalaFunctional       | thrpt |  50 |  236289.522 | ±   5524.769 | ops/s |
|FixBuzzBenchmark.testScalaImperative       | thrpt |  50 | 2382500.827 | ±  52939.858 | ops/s |

## Kotlin Results.
|Benchmark | Mode | Cnt | Score|Error|Units|
|----------|------|----:|-----:|----:|-----|
|FixBuzzBenchmark.testKotlinFunctional      | thrpt |  50 |  188682.710 | ±   4904.750 | ops/s
|FixBuzzBenchmark.testKotlinImperative      | thrpt |  50 | 2791198.801 | ± 147170.861 | ops/s
