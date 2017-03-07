import play.PlayScala

import scalariform.formatter.preferences._

name := "silhouette-slick-db"

version := "3.0.0"

scalaVersion := "2.10.6"

resolvers := ("Atlassian Releases" at "https://maven.atlassian.com/public/") +: resolvers.value

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
	"com.mohiva" %% "play-silhouette" % "3.0.2"
	,"net.codingwell" %% "scala-guice" % "4.0.0"

	,"com.typesafe.play" %% "play-slick" % "1.0.1"
	,"com.typesafe.play" %% "play-slick-evolutions" % "1.0.1"
	,"com.typesafe.slick" %% "slick" % "3.0.3"
	,"com.github.tototoshi" %% "slick-joda-mapper" % "1.2.0" //1.0.1
	,"joda-time" % "joda-time" % "2.9.7"
	,"org.joda" % "joda-convert" % "1.7"
	,"org.joda" % "joda-money" % "0.10.0"
	,"com.github.tototoshi" %% "slick-joda-mapper" % "1.2.0"

	,"com.h2database" % "h2" % "1.4.188"
	,evolutions
)
