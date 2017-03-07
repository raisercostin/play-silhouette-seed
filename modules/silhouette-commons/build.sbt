import play.PlayScala

import scalariform.formatter.preferences._

name := "silhouette-commons"

version := "3.0.0"

scalaVersion := "2.10.6"

resolvers := ("Atlassian Releases" at "https://maven.atlassian.com/public/") +: resolvers.value

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.mohiva" %% "play-silhouette" % "3.0.2"
  ,"net.codingwell" %% "scala-guice" % "4.0.0"
)                                                           
