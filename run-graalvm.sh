#!/usr/bin/env bash
source ~/.sdkman/bin/sdkman-init.sh
jdks=("21.2.0.r11-grl" "21.2.0.r16-grl")
sdk use java 11.0.12-zulu
./gradlew clean jmhJar
for jdk in ${jdks[@]}
do
  sdk use java "$jdk"
  echo "comparing with $jdk"
  gu install native-image
  native-image -jar build/libs/compare-fp-1.0-SNAPSHOT-jmh.jar compare-fp-grl
  ./compare-fp-grl
  cp ./results.txt "results-${jdk}.txt"
  cp ./results.csv "results-${jdk}.csv"
done
