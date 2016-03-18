# Comparing Functional and Imperative performance

During a recent talk on programming paradigms [Pavel Tcholakov](https://twitter.com/pavletko) presented an example using
Java 8 streams to solve the classic FizzBuzz problem.

> Write a program that prints the numbers from 1 to 100.
  But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
  For numbers which are multiples of both three and five print “FizzBuzz”.

Here is a little project to compare the performance of imperative and functional programming.

The [jmh gradle plugin](https://github.com/melix/jmh-gradle-plugin) was a great discovery.


The numbers on Intel Core<sup>TM</sup> i7 2.5Ghz

## Changelog
* Added [Scala](http://www.scala-lang.org) versions.
* Added [Groovy](http://www.groovy-lang.org) versions.
* Created Java functional that doesn't perform map/reduce.
* Refactored Scala version to similar functional without map/reduce.
* Added [Kotlin](https://kotlinlang.org) versions
* Added Scala Streams after [Guillaume Belrose](https://twitter.com/gbelrose) linked to [https://gist.github.com/samklr/6098769](https://gist.github.com/samklr/6098769)
* Refactored Java and Scala Predicates to inline lambdas instead of static methods. No significant difference in performance.

## Groovy Results
|Benchmark | Mode | Score|Error|Units|
|----------|------|-----:|----:|-----|
|FixBuzzBenchmark.testGroovyImperative       | thrpt |  3050891.492| ± 216981.853 | ops/s|
|FixBuzzBenchmark.testGroovyFunctional       | thrpt |    11253.501| ±    851.912 | ops/s|

## Java Results
|Benchmark | Mode | Score|Error|Units|
|----------|------|-----:|----:|-----|
|FixBuzzBenchmark.testJavaImperative         | thrpt |  3111567.460| ±  74396.877 | ops/s|
|FixBuzzBenchmark.testJavaFunctional         | thrpt |   102617.823| ±   5923.711 | ops/s|
|FixBuzzBenchmark.testJavaFunctionalStreams  | thrpt |    81964.718| ±   4424.578 | ops/s|

## Scala Results
|Benchmark | Mode | Score|Error|Units|
|----------|------|-----:|----:|-----|
|FixBuzzBenchmark.testScalaImperative        | thrpt |  2227947.335| ± 185515.263 | ops/s|
|FixBuzzBenchmark.testScalaFunctional        | thrpt |   226113.442| ±  16812.806 | ops/s|
|FixBuzzBenchmark.testScalaFunctionalStreams | thrpt |    51658.673| ±   6061.418 | ops/s|

## Kotlin Results.
|Benchmark | Mode | Score|Error|Units|
|----------|------|-----:|----:|-----|
|FixBuzzBenchmark.testKotlinImperative       | thrpt |  3139184.590| ± 143655.108 | ops/s|
|FixBuzzBenchmark.testKotlinFunctional       | thrpt |   181961.476| ±  13457.517 | ops/s|

