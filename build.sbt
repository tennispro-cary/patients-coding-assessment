name := "prot-interview"

version := "1.0"

scalaVersion := "2.12.19"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
libraryDependencies += "junit" % "junit" % "4.8.1" % "test"

Test / fork := true
