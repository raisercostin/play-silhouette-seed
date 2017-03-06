import play.Project._

name := "play-silhouette-seed-multiproject"

version := "0.9"

play.Project.playScalaSettings

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

lazy val silhouetteModule = (project in file("modules/silhouette"))

lazy val root = (project in file(".")).aggregate(silhouetteModule).dependsOn(silhouetteModule)
