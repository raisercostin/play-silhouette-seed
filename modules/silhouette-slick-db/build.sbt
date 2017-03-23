name := "silhouette-slick-db"

version := "4.0.0"

scalaVersion := "2.11.8"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
	"com.mohiva" %% "play-silhouette" % "4.0.0"
	,ws
    ,"com.mohiva" %% "play-silhouette-persistence" % "4.0.0"
	,"net.codingwell" %% "scala-guice" % "4.0.0"

	,"com.typesafe.play" %% "play-slick" % "2.0.2"
	,"com.typesafe.play" %% "play-slick-evolutions" % "2.0.2"
	,"com.typesafe.slick" %% "slick-hikaricp" % "3.2.0" //override the 3.1.0 version required by play-slick-2.0.2
	,"com.typesafe.slick" %% "slick" % "3.1.0"
	,"com.github.tototoshi" %% "slick-joda-mapper" % "1.2.0"
	,"joda-time" % "joda-time" % "2.9.7"
	,"org.joda" % "joda-convert" % "1.8.1"
	,"org.joda" % "joda-money" % "0.10.0"

	,"com.h2database" % "h2" % "1.4.188"
).map(Common.excludeAll) ++Common.standardIncludes

excludeDependencies ++= Common.standardExcludes