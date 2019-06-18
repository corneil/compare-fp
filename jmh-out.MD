# Performance tests with different JVMs

## 8.0.212-zulu
```
Benchmark                                        Mode  Cnt        Score        Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5    10967.357 ±   3379.684  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5   650805.204 ±  92500.349  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5  3317054.734 ± 369796.880  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5    81803.888 ±   4020.437  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5    90296.687 ±  19480.624  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5   151633.839 ±  11481.034  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5   772479.991 ±  59774.714  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  4474833.730 ± 483689.169  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5   500599.839 ±  56827.632  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5   178778.507 ±  13361.196  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5   763691.653 ±  67895.366  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5  4811301.805 ± 488450.211  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5   251932.491 ±  37649.387  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5    46573.312 ±   8116.097  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5   708674.973 ±  68101.478  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5   786378.926 ±  21489.407  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5   379800.204 ±  43082.140  ops/s
```
## GraalVM CE 19.0.2
```
Benchmark                                        Mode  Cnt        Score        Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5    16474.071 ±  21045.247  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5  1573780.754 ± 149868.768  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5  5461063.613 ± 250858.495  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5   132041.278 ±  14691.298  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5   109356.066 ±  11490.653  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5   276654.936 ±  30506.683  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5  1549195.358 ± 201278.869  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  5247794.317 ± 352325.145  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5   623363.640 ±  33797.227  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5   406664.105 ± 140533.289  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5  1754154.151 ± 102136.561  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5  5792990.747 ± 575524.322  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5   559828.387 ±  35894.038  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5    49249.997 ±   5568.826  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5   950559.596 ± 259256.948  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5  1555235.376 ±  46911.637  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5   653266.993 ±  63719.187  ops/s
```

## 19.0.2-grl *nativeimage*
```
Benchmark                                        Mode  Cnt        Score        Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5    21141.840 ±   2856.613  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5  1681227.273 ± 421328.862  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5  6109039.609 ± 974682.572  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5   134424.688 ±  21378.628  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5   122989.273 ±   6310.615  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5   318640.947 ±  27321.530  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5  1755459.099 ± 261721.392  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  5885099.277 ± 217785.344  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5   697713.684 ±  25502.626  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5   303840.784 ±  47210.757  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5  1580876.136 ± 755796.334  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5  6122316.039 ± 476235.587  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5   547777.896 ±  78506.409  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5    46039.265 ±   8310.237  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5  1021119.366 ±  73652.616  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5  1779747.482 ± 159033.255  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5   592010.143 ±  42318.205  ops/s
```
## 11.0.3-zulu
```
Benchmark                                        Mode  Cnt           Score           Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5       11902.365 ±      1813.863  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5     1630692.215 ±     83032.062  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5   326833664.780 ±  79577055.223  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5       84048.804 ±     18724.634  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5       83834.790 ±     36111.945  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5      195037.268 ±     56996.567  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5     1751588.925 ±    143419.878  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  1224985341.589 ±  76090302.846  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5      742479.726 ±     35292.985  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5      237978.832 ±     75618.500  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5     1611129.607 ±    125313.204  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5  1220873544.748 ± 110771099.032  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5      298313.205 ±     38415.190  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5       46669.312 ±      3452.001  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5     1381204.247 ±     79956.654  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5     1773103.550 ±     74001.590  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5      416678.605 ±     61260.280  ops/s
```
## 8.0.212.j9
```
Benchmark                                        Mode  Cnt        Score         Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5     7039.302 ±    8907.269  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5   324941.707 ±  148289.099  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5  1138229.470 ±  980668.642  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5    24374.090 ±   36843.607  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5    55994.890 ±   87363.050  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5    70987.688 ±    7163.123  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5   421665.177 ±   30718.976  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  3058761.037 ± 2829257.655  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5   201770.198 ±   13073.571  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5   104465.696 ±    7659.145  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5   429496.185 ±  108103.341  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5  3421166.171 ± 1987058.860  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5   122449.884 ±    5901.831  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5    37351.068 ±    4176.814  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5   245172.904 ±    4959.508  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5   255905.443 ±   25781.554  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5   145956.183 ±   49168.105  ops/s
```
## 12.0.1-zulu
```
Benchmark                                        Mode  Cnt           Score           Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5       11268.787 ±      2636.326  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5     1607994.445 ±    187001.304  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5   340014173.584 ±  48761092.054  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5       73123.525 ±      8128.717  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5       87865.907 ±      7733.589  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5      158662.137 ±     90583.481  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5     1595350.137 ±    676530.800  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  1129579888.879 ± 287229347.806  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5      795439.997 ±    108139.884  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5      281615.133 ±     45559.510  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5     1626844.160 ±    297987.434  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5  1168170469.835 ± 136257199.149  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5      257469.716 ±     80640.357  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5       42202.403 ±      8089.726  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5     1304611.608 ±    415845.682  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5     1437743.701 ±    430021.388  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5      364854.149 ±     59221.612  ops/s
```
## 12.0.1.j9
```
Benchmark                                        Mode  Cnt        Score         Error  Units
FixBuzzBenchmark.testGroovyFunctional           thrpt    5     7241.778 ±    2189.491  ops/s
FixBuzzBenchmark.testGroovyImperativeCall       thrpt    5   571102.072 ±  118323.591  ops/s
FixBuzzBenchmark.testGroovyImperativeInline     thrpt    5  2341502.333 ±  631447.459  ops/s
FixBuzzBenchmark.testJavaFunctional             thrpt    5    58889.632 ±   19618.571  ops/s
FixBuzzBenchmark.testJavaFunctionalMapReduce    thrpt    5    48360.044 ±    9539.223  ops/s
FixBuzzBenchmark.testJavaFunctionalVavr         thrpt    5    67799.412 ±   14378.943  ops/s
FixBuzzBenchmark.testJavaImperativeCall         thrpt    5   586079.870 ±   43232.632  ops/s
FixBuzzBenchmark.testJavaImperativeInline       thrpt    5  3186364.780 ± 2723655.950  ops/s
FixBuzzBenchmark.testKotlinFunctional           thrpt    5   171980.568 ±   19312.578  ops/s
FixBuzzBenchmark.testKotlinFunctionalMapReduce  thrpt    5    79890.897 ±    7956.374  ops/s
FixBuzzBenchmark.testKotlinImperativeCall       thrpt    5   584099.068 ±  178268.393  ops/s
FixBuzzBenchmark.testKotlinImperativeInline     thrpt    5  3328254.669 ± 2018255.422  ops/s
FixBuzzBenchmark.testScalaFunctional            thrpt    5   101507.490 ±   10663.232  ops/s
FixBuzzBenchmark.testScalaFunctionalStreams     thrpt    5    37980.962 ±    7009.271  ops/s
FixBuzzBenchmark.testScalaImperativeCall        thrpt    5   524175.827 ±   31627.534  ops/s
FixBuzzBenchmark.testScalaImperativeInline      thrpt    5   554237.085 ±  117565.871  ops/s
FixBuzzBenchmark.testScalaZFunctional           thrpt    5   173535.252 ±   42421.987  ops/s
```
