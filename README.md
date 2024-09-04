# Prot-Interview

This is an opportunity to show your coding and critical thinking skills. These exercises are
intended to mimic tasks that are part of the Associate Engineer duties, as well as the
code review process used at Protenus.

Do NOT upload this to a public location. This is proprietary code owned by Protenus.

General guidelines:
* The exercise should take around two hours to complete. If you haven't completed everything in
  that time, that's okay: please submit what you've got and we'll review that.
* Augment or change any of the provided skeleton code, add new classes, dependencies, etc., as
long as the questions in each part are answered by your code, and it is easy to run the code.
* These are not brain teasers. Each section should have a straightforward implementation, while
providing opportunity to demonstrate analytical thinking.
* Use Scala or Java, whichever you are more comfortable with.

# IDE Guidance

Please use whatever you are most comfortable with. If you have not used gradle before, feel free to
remove all of the gradle code and drop in another build file. An IDE is not required; the
exercises should be simple enough to complete with just a text editor.

## IntelliJ

IntelliJ has great support for Java and Gradle out of the box. Simply open the project folder.
Scala is very well supported, but does require a plugin installation.

## Eclipse

Eclipse has great support for Java. Gradle is well supported but does require a plugin. The Scala
plugin is not recommended.

# Instructions

It's up to you which version of Java to use: we've run the code and tests with Java Temurin versions 17 and 21.

Do not submit the code with new entry points or main methods. The code should run via the gradle or sbt test commands
documented below.

For each of the parts below:
* Update the existing Part1 and Part2 classes (Java or Scala, which ever you chose) to compute the answers to the questions below.
* You can create additional classes/methods as you see fit.
* Update the test classes (Java or Scala, whichever you chose) with appropriate unit tests to validate you implementation.

All exercises rely on the sample data files in src/main/resources

# Running the Code

## Java
To execute the tests on the skeleton code, run `./gradlew test` or on Windows `./gradlew.bat test`.

Gradle can also run in continuous mode, `--continuous`, to rerun the tests as source files change.

Do not submit the code with new entry points or main methods. The code should run via
`./gradlew test`.

## Scala
In addition to Java, you will need to have `sbt` installed to compile and run the project.
For Java 21, you'll want to use an sbt version >= 1.9.0.

To execute the tests on the skeleton code, run `sbt test`.

# Questions to Answer

## Part 1

1. How many patients have zero medical problems?
1. Who has the most medical problems?
1. How many patients have never been prescribed medication?

## Part 2

1. Which patients are mentioned in the article html files?

# Wrap Up

Once your work is complete, commit your changes and submit to Hatchways using the provided instructions.
