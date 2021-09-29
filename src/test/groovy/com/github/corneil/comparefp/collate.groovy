package com.github.corneil.comparefp

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter
import org.apache.commons.csv.CSVRecord
import org.junit.jupiter.api.Test

class CollateResults {
    static void main(String [] args) {
        def app = new CollateResults()
        app.collateFiles();
    }
    @Test
    def collateFiles() {

        def dir = new File('.')
        def files = dir.listFiles(new FilenameFilter() {
            @Override
            boolean accept(File directory, String name) {
                return name.endsWith('.csv')
            }
        })
        def collated = new File('collated.csv')
        collated.withWriter { writer ->
            CSVPrinter printer = CSVFormat.Builder.create()
                    .setHeader('lang', 'paradigm', 'variation', 'version', 'native', 'score')
                    .build().print(writer)
            for (File file : files) {
                def version = (file.name - 'results-') - '-zulu.csv'
                file.withReader { reader ->
                    for (CSVRecord record : CSVFormat.DEFAULT.parse(reader)) {
                        def score = record.get('Score').toDouble()
                        def test = record.get('Benchmark') - 'com.gitbub.corneil.comparefp.jmh.FixBuzzBenchmark.test'
                        test = test - 'com.gitbub.corneil.comparefp.jmh.FizzBuzzBenchmark.test'
                        def lang = test.contains('Groovy') ? 'Groovy' :
                                test.contains('Java') ? 'Java' :
                                        test.contains('Kotlin') ? 'Kotlin' :
                                                test.contains('Scala') ? 'Scala' : 'Unknown'
                        test = test - lang
                        def paradigm = test.contains('Functional') ? 'Functional' :
                                test.contains('Imperative') ? 'Imperative' : 'Unknown'
                        test = test - paradigm
                        def variation = test
                        def isNative = version.contains('grl')
                        printer.printRecord(lang, paradigm, variation, version, isNative, score)
                    }
                }
            }
        }
    }
}
