import sbt._
import Keys._

object LeBonCoinNotifierProject extends Build {
  lazy val root = Project(
    id = "sandbox-tools", base = file("."),
    settings = Project.defaultSettings) //aggregate (daemonProject)

  // lazy val daemonProject = Project(id = "leboncoin-notifier-daemon", base = file("leboncoin-notifier-daemon"))
}