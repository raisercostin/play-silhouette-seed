import scalariform.formatter.preferences._

name := "silhouette-seed-multiproject"

version := "3.0.1"

scalaVersion := "2.10.6"

lazy val silhouetteCommons = (project in file("modules/silhouette-commons"))

lazy val silhouetteSlickDb = (project in file("modules/silhouette-slick-db"))
	.dependsOn(silhouetteCommons)

lazy val silhouetteModule = (project in file("modules/silhouette"))
	.dependsOn(silhouetteSlickDb)

lazy val root = (project in file("."))
	.enablePlugins(PlayScala)
	.aggregate(silhouetteModule, silhouetteSlickDb, silhouetteCommons)
	.dependsOn(silhouetteModule)

play.sbt.routes.RoutesKeys.routesImport ++= Seq("scala.language.reflectiveCalls")
//WebKeys.importDirectly := true

routesGenerator := InjectedRoutesGenerator

scalacOptions ++= Seq(
  "-deprecation", // Emit warning and location for usages of deprecated APIs.
  "-feature", // Emit warning and location for usages of features that should be imported explicitly.
  "-unchecked", // Enable additional warnings where generated code depends on assumptions.
  "-Xfatal-warnings", // Fail the compilation if there are any warnings.
  "-Xlint", // Enable recommended additional warnings.
  "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver.
  "-Ywarn-dead-code", // Warn when dead code is identified.
  "-Ywarn-inaccessible", // Warn about inaccessible types in method signatures.
  "-Ywarn-nullary-override", // Warn when non-nullary overrides nullary, e.g. def foo() over def foo.
  "-Ywarn-numeric-widen" // Warn when numerics are widened.
)

//********************************************************
// Scalariform settings
//********************************************************

defaultScalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(FormatXml, false)
  .setPreference(DoubleIndentClassDeclaration, false)
  .setPreference(PreserveDanglingCloseParenthesis, true)

//********************************************************
// Eclipse settings
//********************************************************
EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource
EclipseKeys.withSource := true
EclipseKeys.eclipseOutput := Some("target2/eclipse")
//multiproject http://stackoverflow.com/questions/13324563/splitting-multiple-projects-w-play-2-scala
EclipseKeys.skipParents in ThisBuild := false
EclipseKeys.withBundledScalaContainers := true
EclipseKeys.projectFlavor := EclipseProjectFlavor.Scala
