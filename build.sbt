organization := "microsoft"

name := "ews-java-api"

version := "1.2"

javaSource in Compile := baseDirectory.value / "src"

libraryDependencies ++= Seq(
  "commons-codec" % "commons-codec" % "1.9",
  "org.slf4j" % "jcl-over-slf4j" % "1.7.7",
  "org.apache.httpcomponents" % "httpclient" % "4.2.5",
  "org.apache.httpcomponents" % "httpcore" % "4.2.5",
  "jcifs" % "jcifs" % "1.3.17"
)
