name := "date-time-java8"

version := "1.0"

scalaVersion := "2.11.8"

//java version
javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

initialize := {
  val _ = initialize.value
  if (sys.props("java.specification.version") != "1.8")
    sys.error("Java 8 is required for this project.")
}

// testing
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
    