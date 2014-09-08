// Turn this project into a Scala.js project by importing these settings
scalaJSSettings

scalacOptions += "-feature"

scalacOptions += "-deprecation"

name := "Owl"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
//  "org.scala-lang.modules.scalajs" %% "scalajs-jasmine-test-framework" % scalaJSVersion % "test"
  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"
)

//libraryDependencies += "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"

// Specify additional .js file to be passed to package-js and optimize-js
unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
baseDirectory.value / "js" / "startup.js"

resolvers += "Spray Repository" at "http://repo.spray.io"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
