jruby-memory-leak
=================

This simple JRuby program demonstrates a memory leak.

## Try it yourself!

* `mvn compile`
* `mvn exec:exec`
* Note that `-Xmx128m` [is specified in `pom.xml`.] (https://github.com/KevinCorcoran/jruby-memory-leak/blob/master/pom.xml#L31)
* Monitor the memory usage of the process you just started.
  * `./watchpidmem.sh 1`
    * This starts a script that periodically (every 1 second) prints the memory usage of the process.
    * The third column in the output, under the `RES` heading, is the resident memory usage of the process.
* Notice that the memory consumption of the process quickly and greatly exceeds the specified maximum heap size!
