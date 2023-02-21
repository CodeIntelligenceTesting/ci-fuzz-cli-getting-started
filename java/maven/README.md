# cifuzz Maven example
This is a simple Maven based project, already configured with
**cifuzz**. It should quickly produce a finding, but slow enough to
see the progress of the fuzzer.

To start make sure you installed **cifuzz** according to the main [CI Fuzz CLI README](https://github.com/CodeIntelligenceTesting/cifuzz#installation).

You can start fuzzing with
```bash
cifuzz run com.example.FuzzTestCase
```
