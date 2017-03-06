import play.PlayScala

scalaVersion := "2.11.1"

name := "play-silhouette-seed-multiproject"

version := "1.0"

//Preparing to separate silhouette dependencies on specific persistence and presentation
//
//Persistence modules
//lazy val silhouetteMemory = (project in file("modules/silhouettePersistence"))
//lazy val silhouetteSlick3H2Memory = (project in file("modules/silhouettePersistence"))
//lazy val silhouetteSlick3H2File = (project in file("modules/silhouettePersistence"))
//lazy val silhouetteMongoDb = (project in file("modules/silhouettePersistence"))
//
//Presentation modules
//lazy val silhouetteTemplatesUi = (project in file("modules/silhouettePersistence"))
//lazy val silhouetteAngularUi = (project in file("modules/silhouettePersistence"))

lazy val silhouetteModule = (project in file("modules/silhouette")).enablePlugins(PlayScala)

lazy val root = (project in file(".")).enablePlugins(PlayScala).aggregate(silhouetteModule).dependsOn(silhouetteModule)
