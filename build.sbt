enablePlugins(ScalaJSPlugin)
// Use Node.
scalaJSUseRhino in Global := false

lazy val scalaJSNode = (project in file(".")).
  settings(
    organization := "com.mscharley",
    name := "scalajs-node",
    version := "0.1.0",
    scalaVersion := "2.11.8"
  )
