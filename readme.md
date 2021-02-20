## coveralls.io Java Sample

[![Coverage Status](https://coveralls.io/repos/github/dxps/coveralls-java-sample/badge.svg?branch=main)](https://coveralls.io/github/dxps/coveralls-java-sample?branch=main)

The purpose of this sample is to understand and show how coveralls.io
can be used for code coverage.

#### Coveralls Report

First, I created a `~/.coveralls` file containing the repo token that I got from Coveralls:
```shell
#!/bin/sh

export COVERALLS_JAVA_SAMPLE_COVERALLS_TOKEN=eOemn...
```

Then just a `. ~/.coveralls` or `source ~/.coveralls` to have this env var available for subsequent commands
like the one below used for testing and reporting.

Next, current I am using `mvn clean test jacoco:report coveralls:report -DrepoToken=$COVERALLS_JAVA_SAMPLE_COVERALLS_TOKEN` 
for running the tests and coveralls report that is being published [here](https://coveralls.io/github/dxps/coveralls-java-sample).   

