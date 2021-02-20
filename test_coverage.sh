#!/bin/sh

## Note: Look into `readme.md` to see how the coveralls repo token
## is being provided and used here.

mvn clean compile test jacoco:report coveralls:report -DrepoToken=$COVERALLS_JAVA_SAMPLE_COVERALLS_TOKEN
