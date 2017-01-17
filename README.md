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
* Added Scalaz version after [Andreas Pauley](https://twitter.com/apauley) linked to [https://gist.github.com/apauley/ca8197f5b9b822097c50](https://gist.github.com/apauley/ca8197f5b9b822097c50) Providing some of the best performance of all the functional versions

## Java Results
|Benchmark | Mode | Score|Units|
|----------|------|-----:|-----|
|FixBuzzBenchmark.testJavaImperativeInline   | thrpt |  3470211.762| ops/s|
|FixBuzzBenchmark.testJavaImperativeCall     | thrpt |   667866.636| ops/s|
|FixBuzzBenchmark.testJavaFunctional         | thrpt |   124968.783| ops/s|
|FixBuzzBenchmark.testJavaFunctionalMapReduce| thrpt |    85608.047| ops/s|

## Groovy Results
|Benchmark | Mode | Score|Units|
|----------|------|-----:|-----|
|FixBuzzBenchmark.testGroovyImperativeInline | thrpt |  3457836.966| ops/s|
|FixBuzzBenchmark.testGroovyImperativeCall   | thrpt |   641418.919| ops/s|
|FixBuzzBenchmark.testGroovyFunctional       | thrpt |    13135.388| ops/s|

## Scala Results
|Benchmark | Mode | Score|Units|
|----------|------|-----:|-----|
|FixBuzzBenchmark.testScalaImperativeInline  | thrpt |  2444048.870| ops/s|
|FixBuzzBenchmark.testScalaImperativeCall    | thrpt |   498185.737| ops/s|
|FixBuzzBenchmark.testScalaZFunctional       | thrpt |   277517.574| ops/s|
|FixBuzzBenchmark.testScalaFunctional        | thrpt |   276278.529| ops/s|
|FixBuzzBenchmark.testScalaFunctionalStreams | thrpt |    47997.627| ops/s|

## Kotlin Results.
|Benchmark | Mode | Score|Units|
|----------|------|-----:|-----|
|FixBuzzBenchmark.testKotlinImperativeInline | thrpt |  3405441.229| ops/s|
|FixBuzzBenchmark.testKotlinImperativeCall   | thrpt |   623649.034| ops/s|
|FixBuzzBenchmark.testKotlinFunctional       | thrpt |   266858.603| ops/s|

## Imperative Inline Results.
|Benchmark | Mode | Score|Units|
|----------|------|-----:|-----|
|FixBuzzBenchmark.testJavaImperativeInline   | thrpt |  3470211.762| ops/s|
|FixBuzzBenchmark.testGroovyImperativeInline | thrpt |  3457836.966| ops/s|
|FixBuzzBenchmark.testKotlinImperativeInline | thrpt |  3405441.229| ops/s|
|FixBuzzBenchmark.testScalaImperativeInline  | thrpt |  2444048.870| ops/s|

## Imperative Call Results.
|Benchmark | Mode | Score|Units|
|----------|------|-----:|-----|
|FixBuzzBenchmark.testJavaImperativeCall     | thrpt |   667866.636| ops/s|
|FixBuzzBenchmark.testGroovyImperativeCall   | thrpt |   641418.919| ops/s|
|FixBuzzBenchmark.testKotlinImperativeCall   | thrpt |   623649.034| ops/s|
|FixBuzzBenchmark.testScalaImperativeCall    | thrpt |   498185.737| ops/s|


## Functional Results.
|Benchmark | Mode | Score|Units|
|----------|------|-----:|-----|
|FixBuzzBenchmark.testScalaZFunctional       | thrpt |   277517.574| ops/s|
|FixBuzzBenchmark.testScalaFunctional        | thrpt |   276278.529| ops/s|
|FixBuzzBenchmark.testKotlinFunctional       | thrpt |   266858.603| ops/s|
|FixBuzzBenchmark.testJavaFunctional         | thrpt |   124968.783| ops/s|
|FixBuzzBenchmark.testJavaFunctionalMapReduce| thrpt |    85608.047| ops/s|
|FixBuzzBenchmark.testScalaFunctionalStreams | thrpt |    47997.627| ops/s|
|FixBuzzBenchmark.testGroovyFunctional       | thrpt |    13135.388| ops/s|

[<br/><br/><img width="48px" height="48px" src="https://raw.githubusercontent.com/corneil/spring-data-rest-angular-demo/master/buy-me-coffee.png"><img><br/><span style="font-size: x-small">Buy me Coffee</span>](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=corneil%2eduplessis%40gmail%2ecom&lc=ZA&item_name=Corneil%20du%20Plessis&currency_code=USD&bn=PP%2dDonationsBF%3abtn_donateCC_LG%2egif%3aNonHosted)
