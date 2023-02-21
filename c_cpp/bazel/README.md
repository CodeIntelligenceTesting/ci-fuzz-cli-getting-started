# cifuzz bazel example
This is a simple bazel based project, already configured with
**cifuzz**. It should quickly produce a finding, but slow enough to
see the progress of the fuzzer.

To start make sure you installed **cifuzz** according to the main [CI Fuzz CLI README](https://github.com/CodeIntelligenceTesting/cifuzz#installation).

You can start the fuzzing with
```bash
cifuzz run //src:explore_me_fuzz_test
```
