import Dependencies._

lazy val root = (project in file(".")).
  settings(

    inThisBuild(List(
      organization := "com.mono",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),

    name := "kafka-live-sbt",

    libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "3.0.5" % Test,
        "org.scalacheck" %% "scalacheck" % "1.14.0" % Test,
        "org.slf4j" % "slf4j-simple" % "1.7.25",
        "io.dropwizard" % "dropwizard-core" % "1.3.23",
        "io.dropwizard" % "dropwizard-client" % "1.3.23",
        "io.dropwizard" % "dropwizard-jdbi3" % "1.3.23",
        "io.dropwizard" % "dropwizard-assets" % "1.3.23",
        "org.jdbi" % "jdbi" % "2.55",
        "commons-io" % "commons-io" % "2.5",
        "org.apache.kafka" % "kafka-clients" % "2.4.1",
        "org.apache.kafka" % "kafka-streams" % "2.4.1",
        "org.apache.avro" % "avro" % "1.8.0",
        "io.confluent" % "kafka-streams-avro-serde" % "5.3.2",
        "com.amazonaws" % "aws-java-sdk-s3" % "1.11.77",
        "org.scala-lang" % "scala-library" % "2.12.6",
        "org.apache.kafka" %% "kafka-streams-scala" % "2.4.1",
        "org.postgresql" % "postgresql" % "42.2.12"
        //"junit" % "junit" % "4.12" % "Test"
    ),

    resolvers ++= Seq(
      "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/",
      "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/",
      "Second Typesafe repo" at "https://repo.typesafe.com/typesafe/maven-releases/",
      "maven2" at "https://repo1.maven.org/maven2",
      "confluent" at "http://packages.confluent.io/maven",
       Resolver.sonatypeRepo("public")
    )

  )
