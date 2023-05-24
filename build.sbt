val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "protoparser",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

// libraryDependencies += "org.antlr" % "antlr4" % "4.7"
libraryDependencies += "org.antlr" % "antlr4-runtime" % "4.13.0"

Antlr4 / antlr4PackageName := Some("ai.privado.proto.parser")
Antlr4 / antlr4Version := "4.13.0"
Antlr4 / antlr4GenVisitor := true
Antlr4 / javaSource := (Compile / sourceManaged).value

enablePlugins(JavaAppPackaging, LauncherJarPlugin, Antlr4Plugin)
