import sbt._,Keys._

object Build extends Build {
  lazy val baseSettings = Seq(
    scalaVersion := "$scala_version$",
    organization := "com.github.hexx",
    scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-language:_")
  )

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="normalize"$",
    base = file(".")
  ).settings(
    baseSettings ++ seq(
      name := "$name;format="normalize"$",
      version := "0.1.0",
      libraryDependencies ++= Seq(
      ),
      initialCommands in console += Seq(
      ).map("import " + _ + "\n").mkString
    ) : _*
  )
}
