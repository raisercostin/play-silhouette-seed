import play.PlayScala

import scalariform.formatter.preferences._

name := "silhouette-seed-multiproject"

version := "1.0"

scalaVersion := "2.10.6"

resolvers := ("Atlassian Releases" at "https://maven.atlassian.com/public/") +: resolvers.value

resolvers += Resolver.sonatypeRepo("snapshots")

//Preparing to separate silhouette dependencies on specific persistence and presentation
//
//Persistence modules
//lazy val silhouetteMemory = (project in file("modules/silhouettePersistence"))
//lazy val silhouetteMongoDb = (project in file("modules/silhouettePersistence"))
//
//Presentation modules
//lazy val silhouetteTemplatesUi = (project in file("modules/silhouettePersistence"))
//lazy val silhouetteAngularUi = (project in file("modules/silhouettePersistence"))

//common configs for silhouette
lazy val silhouetteCommons = (project in file("modules/silhouette-commons"))

lazy val silhouetteSlickDb = (project in file("modules/silhouette-slick-db"))
	.dependsOn(silhouetteCommons)

lazy val silhouetteModule = (project in file("modules/silhouette"))
	.dependsOn(silhouetteSlickDb)
	.enablePlugins(PlayScala)

lazy val root = (project in file("."))
	.enablePlugins(PlayScala)
	.aggregate(silhouetteModule, silhouetteSlickDb, silhouetteCommons)
	.dependsOn(silhouetteModule)

play.PlayImport.PlayKeys.routesImport ++= Seq("scala.language.reflectiveCalls") 


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

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource
EclipseKeys.withSource := true
EclipseKeys.eclipseOutput := Some("target2/eclipse")
//multiproject http://stackoverflow.com/questions/13324563/splitting-multiple-projects-w-play-2-scala
EclipseKeys.skipParents in ThisBuild := false
EclipseKeys.withBundledScalaContainers := true
EclipseKeys.projectFlavor := EclipseProjectFlavor.Scala 