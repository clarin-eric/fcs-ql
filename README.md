# FCS-QL and LexCQL Parser and Utilities for FCS Core v2.0

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
