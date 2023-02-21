# cifuzz other build systems example

This is a simple C++ project which doesn't use CMake, to demonstrate how
**cifuzz** can be used with other build systems.

To start make sure you installed **cifuzz** according to the main [CI Fuzz CLI README](https://github.com/CodeIntelligenceTesting/cifuzz#installation).

What makes this project usable with **cifuzz** is the `my_fuzz_test` target in the [Makefile](Makefile) and the `build-command` setting in the [cifuzz.yaml](cifuzz.yaml).

You can start fuzzing with
```bash
cifuzz run my_fuzz_test
```
