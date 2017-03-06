import play.PlayScala

import scalariform.formatter.preferences._

name := "silhouette-commons"

version := "1.0"

scalaVersion := "2.10.6"

resolvers := ("Atlassian Releases" at "https://maven.atlassian.com/public/") +: resolvers.value

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.mohiva" %% "play-silhouette" % "2.0"
  ,"net.codingwell" %% "scala-guice" % "4.0.0-beta5"
)                                                           
