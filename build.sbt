scalaVersion := "2.9.1"

organization := "com.github"

name := "scalaweb"

seq(webSettings:_*)

libraryDependencies += "org.fusesource.scalate" % "scalate-core" % "1.5.3"

libraryDependencies += "org.scalatra" %% "scalatra" % "2.0.4"

libraryDependencies += "org.scalatra" %% "scalatra-scalate" % "2.0.4"

libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.22" % "container"

libraryDependencies += "javax.servlet" % "servlet-api" % "2.5" % "provided"
