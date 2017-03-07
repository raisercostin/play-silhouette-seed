name := "silhouette-commons"

version := "4.0.0"

scalaVersion := "2.11.8"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
	"com.mohiva" %% "play-silhouette" % "4.0.0"
	,"net.codingwell" %% "scala-guice" % "4.0.0"
)                                                           
