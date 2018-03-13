import scalariform.formatter.preferences._

lazy val commonSettings = Seq(
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.4",
  scalariformPreferences := scalariformPreferences.value
    .setPreference(AlignArguments, true)
    .setPreference(AlignParameters, true)
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(AllowParamGroupsOnNewlines, true)
    .setPreference(DanglingCloseParenthesis, Force)
    .setPreference(DoubleIndentConstructorArguments, true)
    .setPreference(DoubleIndentMethodDeclaration, true)
    .setPreference(IndentLocalDefs, true)
    .setPreference(NewlineAtEndOfFile, true),
  skip in packageJSDependencies := false,
  webpackBundlingMode := BundlingMode.LibraryOnly(),
  useYarn := true,
  emitSourceMaps := false
)

lazy val root = (project in file("."))
  .settings(
    npmDependencies in Compile ++=
      "material-ui"       -> "next"          ::
      "material-ui-icons" -> "1.0.0-beta.17" ::
      "react"             -> "16.1.1"        ::
      "react-dom"         -> "16.1.1"        ::
      Nil,
    libraryDependencies ++=
      "com.github.japgolly.scalacss"      %%% "core"        % "0.5.3"     ::
      "com.github.japgolly.scalacss"      %%% "ext-react"   % "0.5.3"     ::
      "com.github.japgolly.scalajs-react" %%% "core"        % "1.1.1"     ::
      "com.github.japgolly.scalajs-react" %%% "extra"       % "1.1.1"     ::
      "org.scala-js"                      %%% "scalajs-dom" % "0.9.2"     ::
      "org.typelevel"                     %%  "cats-core"   % "1.0.1"     ::
      Nil,
    name := "scalajs-react-material-ui",
    commonSettings,
    organization := "com.pangwarta",
    licenses += ("Apache 2.0",  url("http://www.apache.org/licenses/LICENSE-2.0")),
    mappings.in(Compile, packageBin) += baseDirectory.in(ThisBuild).value / "LICENSE" -> "LICENSE"
  ).enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

lazy val example = (project in file("example"))
  .dependsOn(root)
  .settings(
    commonSettings,
    scalaJSUseMainModuleInitializer := true,
    scalaJSUseMainModuleInitializer in Test := false,
    scalacOptions += "-Ypartial-unification"
  ).enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra :=
  <scm>
    <connection>scm:git:github.com:pangwarta/scalajs-react-material-ui</connection>
    <developerConnection>scm:git@github.com:pangwarta/scalajs-react-material-ui.git</developerConnection>
    <url>github.com:pangwarta/scalajs-react-material-ui.git</url>
  </scm>
    <developers>
      <developer>
        <id>zach-albia</id>
        <name>Zachary Albia</name>
      </developer>
      <developer>
        <id>KD</id>
        <name>Kent Dun Lagaras</name>
      </developer>
    </developers>

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")