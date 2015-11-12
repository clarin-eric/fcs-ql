#! /bin/bash

# Build and run test file in TestRig 20150505 /ljo
# Made it somewhat mavenized 20151109 /ljo

fcs_home="/home/ljo/arbete/Clarin-eric/fcs-grammar/";
pushd ${fcs_home};

mvn antlr4:antlr4 compiler:compile package
# New package for TestRig is org.antlr.v4.gui.TestRig but gives NPE right now.
#mvn -e exec:java -Dexec.mainClass="org.antlr.v4.gui.TestRig" -Dexec.args="eu.clarin.sru.fcs.qlparser.FCSParser query -gui $1"
mvn exec:java -Dexec.mainClass="org.antlr.v4.runtime.misc.TestRig" -Dexec.args="eu.clarin.sru.fcs.qlparser.FCSParser query -gui $1" #-Dexec.classpathScope="runtime"

popd
