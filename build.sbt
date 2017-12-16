import scalariform.formatter.preferences._

lazy val commonSettings = Seq(
  version := "0.0.0-SNAPSHOT",
  scalaVersion := "2.12.4",
  scalariformPreferences := scalariformPreferences.value
    .setPreference(AlignArguments, true)
    .setPreference(AlignParameters, true)
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(DoubleIndentConstructorArguments, true)
    .setPreference(DoubleIndentMethodDeclaration, true)
    .setPreference(NewlineAtEndOfFile, true),
  skip in packageJSDependencies := false,
  webpackBundlingMode := BundlingMode.LibraryOnly(),
  useYarn := true,
  emitSourceMaps := false
)

lazy val root = (project in file("."))
  .settings(
    npmDependencies in Compile ++=
      "material-ui" -> "next"   ::
      "react"       -> "16.1.1" ::
      "react-dom"   -> "16.1.1" ::
      Nil,
    libraryDependencies ++=
      "com.github.japgolly.scalacss"      %%% "core"        % "0.5.3"     ::
      "com.github.japgolly.scalacss"      %%% "ext-react"   % "0.5.3"     ::
      "com.github.japgolly.scalajs-react" %%% "core"        % "1.1.1"     ::
      "com.github.japgolly.scalajs-react" %%% "extra"       % "1.1.1"     ::
      "org.scala-js"                      %%% "scalajs-dom" % "0.9.2"     ::
      "org.typelevel"                     %%  "cats-core"   % "1.0.0-RC1" ::
      Nil,
    name := "scalajs-react-material-ui",
    commonSettings
  ).enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

lazy val example = (project in file("example"))
  .dependsOn(root)
  .settings(
    commonSettings,
    scalaJSUseMainModuleInitializer := true,
    scalaJSUseMainModuleInitializer in Test := false,
    scalacOptions += "-Ypartial-unification"
  ).enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
