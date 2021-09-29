#!/usr/bin/env groovy
@Grapes(
    @Grab(group = 'org.apache.commons', module = 'commons-csv', version = '1.9.0')
)
import org.apache.commons.csv.*

import java.math.RoundingMode

def dir = new File('.')
def files = dir.listFiles(new FilenameFilter() {
    @Override
    boolean accept(File directory, String name) {
        return name.startsWith('results-') && name.endsWith('.csv')
    }
})
class Record {
    String lang
    String paradigm
    String variation
    String version
    boolean isNative
    BigDecimal score
}
def collated = new File('collated.csv')
collated.withWriter { writer ->
    CSVPrinter printer = CSVFormat.Builder.create()
            .setHeader('lang', 'paradigm', 'variation', 'version', 'native', 'score')
            .build().print(writer)
    def records = new ArrayList<Record>()
    for (File file : files) {
        def version = (file.name - 'results-') - '-zulu' - '.csv'
        println "Reading $file"
        file.withReader { reader ->
            for (CSVRecord record : CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader)) {
                def data = new Record()
                data.score = record.get('Score').toBigDecimal().setScale(2, RoundingMode.HALF_UP)
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
                data.variation = test
                data.paradigm = paradigm
                data.lang = lang
                data.isNative = version.contains('grl')
                data.version = version
                records.add(data)
            }
        }
    }
    records.sort(true) { a, b ->
        return -1 * a.score.compareTo(b.score);
    }
    records.forEach { record ->
        printer.printRecord(record.lang, record.paradigm, record.variation, record.version, record.isNative, record.score)
    }
}
