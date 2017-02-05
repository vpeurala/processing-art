lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "fi.villepeurala",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello"
  )

libraryDependencies += "org.processing" % "core" % "3.2.3"

