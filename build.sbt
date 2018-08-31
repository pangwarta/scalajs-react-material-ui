lazy val commonSettings = Seq(
  version := "0.2.0-SNAPSHOT",
  scalaVersion := "2.12.6",
  skip in packageJSDependencies := false,
  webpackBundlingMode := BundlingMode.LibraryOnly(),
  useYarn := false,
  version in webpack := "4.17.1",
  version in startWebpackDevServer := "3.1.7",
  webpackCliVersion := "3.1.0",
  emitSourceMaps := false
)

lazy val root = (project in file("."))
  .settings(
    npmDependencies in Compile ++=
      "@material-ui/core"  -> "3.0.1"          ::
      "@material-ui/icons" -> "3.0.1"          ::
      "react"             -> "16.4.2"         ::
      "react-dom"         -> "16.4.2"         ::
      Nil,
    libraryDependencies ++=
      "com.github.japgolly.scalacss"      %%% "core"        % "0.5.5"     ::
      "com.github.japgolly.scalacss"      %%% "ext-react"   % "0.5.5"     ::
      "com.github.japgolly.scalajs-react" %%% "core"        % "1.2.3"     ::
      "com.github.japgolly.scalajs-react" %%% "extra"       % "1.2.3"     ::
      "org.scala-js"                      %%% "scalajs-dom" % "0.9.6"     ::
      "org.typelevel"                     %%  "cats-core"   % "1.2.0"     ::
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
    scalacOptions += "-Ypartial-unification",
    webpackExtraArgs := Seq("--mode", "development"),
    webpackDevServerPort := 34567,
    webpackDevServerExtraArgs := Seq(
      "--content-base", (baseDirectory in ThisProject).value.getPath,
      "--open-page", "index-dev.html"
    )
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