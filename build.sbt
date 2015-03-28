enablePlugins(ScalaJSPlugin)

name := "Scala on iOS POC"

scalaVersion := "2.11.6"

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "0.8.2"

artifactPath in Compile in fastOptJS := baseDirectory.value / "index.ios.js"
