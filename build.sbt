name := "SBTassignment"

version := "0.1"

scalaVersion := "2.13.6"

lazy val common = project.in(file("common"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.9",
      "org.scalaz" %% "scalaz-core" % "7.3.0-SNAPSHOT",
      "org.scalatest" %% "scalatest" % "3.2.9" % Test,
      "org.mockito" %% "mockito-scala" % "1.16.37" % Test
    )

  )
lazy val rest = project.in(file("rest"))
  .settings(
    libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-http" % "10.2.5",
      "com.typesafe.akka" %% "akka-stream" % "2.6.15",
      "com.typesafe.akka" %% "akka-actor" % "2.6.15",
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.15" % Test,
      "com.typesafe.akka" %% "akka-http-testkit" % "10.2.5" % Test,
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.15" % Test
    )
  )
lazy val root = project.in(file(".")).aggregate(common,rest)


