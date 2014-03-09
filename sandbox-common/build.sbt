import sbtassembly.Plugin._

import AssemblyKeys._

organization := "net.sandbox"

name := "sandbox-common"

version := "0.1"

scalacOptions += "-deprecation"

scalacOptions += "-feature"

scalacOptions += "-unchecked"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.withSource := true

jarName in assembly := "sandbox-common.jar"

seq(assemblySettings: _*)

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
  {
    case "META-INF/spring.tooling" => MergeStrategy.concat
    case x => old(x)
  }
}