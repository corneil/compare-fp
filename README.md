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
|FixBuzzBenchmark.testFunctional|thrpt|50|61090.872| ± 1798.539 | ops/s|
|FixBuzzBenchmark.testImperative|thrpt|50|182779.152| ± 3148.576 | ops/s|
