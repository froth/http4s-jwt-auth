import sbt._

object Dependencies {

  object Versions {
    val cats       = "2.4.2"
    val catsEffect = "2.3.3"
    val fs2        = "2.5.1"
    val http4s     = "0.21.19"
    val jwt        = "5.0.0"

    val betterMonadicFor = "0.3.1"
    val kindProjector    = "0.11.3"

    val scalaTest = "3.2.4"
  }

  object Libraries {
    def http4s(artifact: String): ModuleID = "org.http4s" %% artifact % Versions.http4s

    val cats       = "org.typelevel" %% "cats-core"   % Versions.cats
    val catsEffect = "org.typelevel" %% "cats-effect" % Versions.catsEffect
    val fs2        = "co.fs2"        %% "fs2-core"    % Versions.fs2
    val jwtCore    = "com.pauldijou" %% "jwt-core"    % Versions.jwt

    val http4sDsl    = http4s("http4s-dsl")
    val http4sServer = http4s("http4s-blaze-server")

    // Test
    val scalaTest = "org.scalatest" %% "scalatest" % Versions.scalaTest
  }

  object CompilerPlugins {
    val betterMonadicFor = compilerPlugin("com.olegpy" %% "better-monadic-for" % Versions.betterMonadicFor)
    val kindProjector = compilerPlugin(
      "org.typelevel" % "kind-projector" % Versions.kindProjector cross CrossVersion.full
    )
  }

}
