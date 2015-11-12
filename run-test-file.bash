#! /bin/bash
# Only build test sources and run queries in test files 20150527/ljo

mvn compiler:testCompile

mvn exec:java -Dexec.mainClass="eu.clarin.sru.fcs.qlparser.FCSTest" -Dexec.args="$1" -Dexec.classpathScope="test"
