ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala-web-scraping",
    libraryDependencies ++= Seq(
      "org.jsoup" % "jsoup" % "1.15.3",
      "net.ruippeixotog" %% "scala-scraper" % "3.0.0"
    )
  )
