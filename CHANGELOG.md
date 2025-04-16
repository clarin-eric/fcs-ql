# Changelog

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