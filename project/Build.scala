import sbt._
import Keys._

object LeBonCoinNotifierProject extends Build {
  lazy val root = Project(
    id = "sandbox-tools", base = file("."),
    settings = Project.defaultSettings) aggregate (sandboxCommon)

  lazy val sandboxCommon = Project(id = "sandbox-common", base = file("sandbox-common"))
}