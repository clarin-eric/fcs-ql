FCS-QL parser and utilities for FCS Core v2.0
It is mavenized so:
$ mvn antlr4:antlr4 compiler:compile package
would create a jar with dependencies to include as component.

By:
$ ./run.bash src/test/resources/fcs-ql-v2.0/test.txt
you would build source and run queries from the given file.

or:
$ ./run-test-file.bash src/test/resources/fcs-ql-v2.0/test.txt
you would build test sources and run queries from the given file.

Good luck!

/Leif-Jöran
