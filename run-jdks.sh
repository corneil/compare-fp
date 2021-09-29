#!/usr/bin/env bash
source ~/.sdkman/bin/sdkman-init.sh
jdks=("11.0.12-zulu" "17.0.0-zulu")
sdk use java "${jdks[0]}"
./gradlew clean jmhJar
for jdk in ${jdks[@]}
do  
  sdk use java "$jdk"
  echo "comparing with $jdk"
  java -jar build/libs/compare-fp-1.0-SNAPSHOT-jmh.jar
  cp ./results.txt "results-${jdk}.txt"
  cp ./results.csv "results-${jdk}.csv"
done
