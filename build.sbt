lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.13.10"
    )),
    name := "scalatest-bootstrap"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test
