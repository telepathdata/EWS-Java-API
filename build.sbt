organization := "microsoft"

name := "ews-java-api"

version := "1.2"

val jdk8 = System.getProperties.get("java.runtime.version").toString.startsWith("1.8")

javaSource in Compile := baseDirectory.value / "src"

libraryDependencies ++= Seq(
  "commons-codec" % "commons-codec" % "1.4",
  "org.slf4j" % "jcl-over-slf4j" % "1.7.7",
  "commons-httpclient" % "commons-httpclient" % "3.1",
  "jcifs" % "jcifs" % "1.3.17"
)

if (jdk8) { javacOptions ++= Seq("-source", "1.7", "-Xdoclint:none") } else { javacOptions in doc ++= Seq() }
