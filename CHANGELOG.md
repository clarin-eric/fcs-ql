# Changelog

# [3.0.0](https://github.com/clarin-eric/fcs-simple-endpoint/releases/tag/FCS-QL-3.0.0) - 2025-11-17

- Changes:
  - **Breaking**: Moved `QueryParser` and related query tree classes from [`fcs-simple-endpoint`](https://github.com/clarin-eric/fcs-simple-endpoint) here to decouple from FCS endpoints and to allow reusability.

    Because of this move, all imports in FCS endpoints that evaluate queries need to change:
    - `eu.clarin.sru.server.fcs.parser.*` → `eu.clarin.sru.fcs.qlparser.fcs.*` (FCS-QL)
    - `eu.clarin.sru.server.fcs.parser_lex.*` → `eu.clarin.sru.fcs.qlparser.lex.*` (LexCQL)
    - `eu.clarin.sru.server.fcs.parser.QueryParserException` → `eu.clarin.sru.fcs.qlparser.QueryParserException`

    The internal ANTLR4 lexers and parsers were also moved into their own namespaces:
    - `eu.clarin.sru.fcs.qlparser.*` → `eu.clarin.sru.fcs.qlparser.fcs.*`  
      (for FCS-QL, e.g. `FCSLexer`, `FCSParser`, `FCSParserBaseVisitor`)
    - `eu.clarin.sru.fcs.qlparser.*` → `eu.clarin.sru.fcs.qlparser.lex.*`  
      (for LexCQL, e.g. `LexLexer`, `LexParser`, `LexParserBaseVisitor`)

    The CQL parser remains in [`fcs-sru-server`](https://github.com/clarin-eric/fcs-sru-server) (external, non-CLARIN dependency `org.z3950.zing:cql-java:1.13`) as there is no shared code base.
  - Slight change to bild process: ANTLR4 generated source files will be placed into [`src/main/java`](src/main/java/) instead of default `target/generated-sources/antlr4` and are now version controlled. This will avoid code editor errors due to non-existing files but requires synchronisation and recreation of ANTLR4 files when grammar files are changed. E.g., run `mvn antlr4:antlr4` to generate those files. A default build with `mvn clean package` will also recreate the ANTLR4 files from the grammar files (and might lead to errors when grammar files have breaking changes)!
  - Add source locations (start and stop offsets in query text) to query nodes. (Disabled by default. See `AbstractQueryParser.[is|set]EnableSourceLocations()`)

- Dependencies:
  - Change `org.slf4j` back to `compile` (default) scope
  - Remove `org.apache.maven.plugin-testing:maven-plugin-testing-harness` test dependency (unused)

# [2.0.1](https://github.com/clarin-eric/fcs-simple-endpoint/releases/tag/FCS-QL-2.0.1) - 2025-04-16

- Bug fixes:
  - Fix `NOT` (`!`) precedence, repeated `!` expressions should immediately nest together and have highest precedence

# [2.0.0](https://github.com/clarin-eric/fcs-simple-endpoint/releases/tag/FCS-QL-2.0.0) - 2025-04-16

- Changes:
  - **Breaking**: Added missing regular expresion special characters `]` and `}` to FCS-QL lexer grammar
  - **Breaking**: Fix FCS-QL parser grammer to account for nestable "expression-not" and "expression-group" rules
  - **Breaking**: Update precedences of `expression*` rules, "not" is highest, followed by "and" than "or" (more intuitive for user probably)
  - Suppress `maven-javadoc-plugin`'s `doclint` warnings about missing comments
  - Code cleanup (imports)

- Dependencies:
  - Move `org.slf4j` to `test` scope
  - Move `org.slf4j:slf4j-log4j12` to `org.slf4j:slf4j-reload4j`

# [1.0.0](https://github.com/clarin-eric/fcs-simple-endpoint/releases/tag/FCS-QL-1.0.0) - 2025-04-04

NOTE: Make this an official release!

- Additions:
  - Add grammar for LexCQL and simple test
  - Add `mvn site` reporting
  - Add [Github Pages](https://clarin-eric.github.io/fcs-ql/) with [JavaDoc](https://clarin-eric.github.io/fcs-ql/project-reports.html)
  - Add `CHANGELOG.md` document

- Dependencies:
  - Add `maven-release-plugin`
  - Bump Maven build plugin versions
  - Bump `org.slf4j` to `2.0.17`
  - Bump `org.antlr` to `4.13.2`

- Changes:
  - Change from `README.txt` to `README.md`
  - Update `pom.xml` information (`scm`), cleanups

For older changes, see commit history at [https://github.com/clarin-eric/fcs-ql/commits/main/](https://github.com/clarin-eric/fcs-ql/commits/main/?after=22cd672dcdf09a41dca4355d1356183ebbf077da+0&branch=main&qualified_name=refs%2Fheads%2Fmain)