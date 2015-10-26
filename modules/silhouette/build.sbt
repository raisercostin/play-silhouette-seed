Common.settings

libraryDependencies ++= Seq(
  evolutions,
  filters,
  "com.adrianhurt" %% "play-bootstrap3" % "0.4.4-P24",
  "com.h2database" % "h2" % "1.4.188",
  "com.mohiva" %% "play-silhouette" % "3.0.0",
  "com.typesafe.play" %% "play-slick" % "1.0.1",
  "com.typesafe.play" %% "play-slick-evolutions" % "1.0.1",
  "net.codingwell" %% "scala-guice" % "4.0.0",
  "net.ceedubs" %% "ficus" % "1.1.2",
  "org.webjars" %% "webjars-play" % "2.4.0-1",
  //
  "com.mohiva" %% "play-silhouette-testkit" % "3.0.0" % "test"
)