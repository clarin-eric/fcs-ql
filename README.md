# FCS-QL and LexCQL Parser and Utilities for FCS Core v2.0

This library contains the [ANTLR4](https://www.antlr.org/) grammar files for the `FCS-QL` and `LexCQL` query languages used in FCS Core 2.0 and the LexFCS extension.

Generated Lexer and Parser classes for both query languages as well as the intermediary query tree classes for use in FCS Endpoints are also included.

## Building

Create a JAR with dependencies:

```bash
mvn antlr4:antlr4 compiler:compile package

# or
mvn clean package
```

## Testing

Build sources and run queries from the given file:  
_You might need to update paths in `run.bash`._

```bash
./run.bash src/test/resources/fcs-ql-v2.0/test.txt
```

Build test sources and run queries from the given file:

```bash
./run-test-file.bash src/test/resources/fcs-ql-v2.0/test.txt
```

Good luck!

/Leif-Jöran
