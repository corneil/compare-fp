# Performance tests with different JVMs

## 8.0.192 openjdk
```
Benchmark                                        Mode  Cnt        Score       Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5    13584.003 ±   331.485  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5   724303.222 ±  9530.107  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5  3568513.140 ± 36932.687  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5    87409.781 ±  1741.376  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5   103834.295 ±  3403.042  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5   174017.038 ± 22302.836  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5   836983.525 ±  5968.654  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  4791720.290 ± 40725.766  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5   570019.349 ±  2408.288  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5   199929.137 ±  1857.162  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5   823727.990 ±  5304.793  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5   832974.976 ± 20422.871  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5   300916.123 ±  8192.438  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5    49099.388 ±   976.927  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5   751554.055 ±  6887.954  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5   795196.341 ±  5971.565  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5   392776.208 ±  6470.389  ops/s
```

## 8.0.212-zulu
```
Benchmark                                        Mode  Cnt        Score        Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5    13885.211 ±    172.102  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5   715404.151 ±  11978.379  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5  3491082.544 ± 180915.619  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5    87888.138 ±   3159.528  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5   102413.538 ±    679.980  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5   178539.563 ±   9630.943  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5   830003.041 ±  16628.552  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  4776777.011 ±  43444.845  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5   565556.474 ±  38935.174  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5   197060.564 ±   1271.357  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5   832537.690 ±   3903.170  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5   821772.422 ±   9505.439  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5   293005.658 ±  12710.013  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5    49238.196 ±    540.347  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5   742431.664 ±   6056.402  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5   793052.180 ±   5747.714  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5   392393.300 ±   4077.641  ops/s
```

## 11.0.3-zulu
```
Benchmark                                        Mode  Cnt           Score          Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5       14058.866 ±      580.589  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5     1700090.000 ±   176808.775  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5   371601169.488 ±  9476772.329  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5      116036.660 ±    16772.349  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5      114709.255 ±     8088.940  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5      220438.033 ±     9580.531  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5     1924970.226 ±   150141.340  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  1340630858.280 ± 13562400.081  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5      941763.169 ±    17077.112  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5      315808.648 ±     4196.371  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5     1864464.671 ±   127818.784  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5     1814014.115 ±   136175.696  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5      312346.641 ±    15771.850  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5       37387.523 ±    21110.558  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5     1341072.171 ±   486241.031  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5     1586652.224 ±   550373.933  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5      432237.386 ±    71102.424  ops/s
```

## Graal 1.0.0-rc16
```
Benchmark                                        Mode  Cnt        Score        Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5    20098.758 ±   1661.267  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5  1739135.730 ±  45629.699  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5  5589009.947 ± 628608.625  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5   131077.070 ±   7928.100  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5   131793.909 ±   7125.384  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5   327803.952 ±   4827.781  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5  1700304.167 ± 131403.655  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  5665671.441 ± 101929.873  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5   669322.987 ±  17740.438  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5   379141.644 ± 173204.459  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5  1344287.072 ± 442365.618  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5  1528948.926 ± 584588.520  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5   522352.180 ± 146131.868  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5    37096.163 ±  36348.692  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5   998863.160 ± 203787.071  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5  1678987.721 ± 182502.514  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5   534244.968 ± 521496.282  ops/s
```

## Graal 19.0
```
Benchmark                                        Mode  Cnt        Score        Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5    23852.849 ±    478.295  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5  1977362.311 ±  35219.127  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5  6280905.206 ±  64678.958  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5   140657.787 ±   1381.583  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5   149340.693 ±   4853.382  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5   338426.262 ±   2097.355  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5  1910113.376 ±  11583.415  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  6223106.247 ± 106370.973  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5   740853.899 ±  23542.633  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5   466513.404 ±   7362.638  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5  1895636.973 ±  62181.139  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5  1884629.651 ± 146688.247  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5   640498.283 ±   2825.744  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5    58288.792 ±    750.412  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5  1132165.161 ±   1709.988  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5  1855439.133 ±  20932.127  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5   778551.085 ±   6368.231  ops/s
```