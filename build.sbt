import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "jp.hotbrain",
      scalaVersion := "2.12.2",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "parser_combinator_sample",
    libraryDependencies ++= Seq(
      "junit" % "junit" % "4.1",
      "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.6"
    )
  )
