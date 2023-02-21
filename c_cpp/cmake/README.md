# cifuzz CMake example
This is a simple CMake based project, already configured with 
**cifuzz**. It should quickly produce a finding, but slow enough to 
see the progress of the fuzzer.

To start make sure you installed **cifuzz** according to the main [CI Fuzz CLI README](https://github.com/CodeIntelligenceTesting/cifuzz#installation).

You can start the fuzzing with
```bash
cifuzz run my_fuzz_test
```
