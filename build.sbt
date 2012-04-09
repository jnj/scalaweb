scalaVersion := "2.9.1"

organization := "com.github"

name := "scalaweb"

libraryDependencies += "org.fusesource.scalate" % "scalate-core" % "1.5.3"

libraryDependencies += "org.scalatra" %% "scalatra" % "2.0.4"

libraryDependencies += "org.scalatra" %% "scalatra-scalate" % "2.0.4"

libraryDependencies += "org.eclipse.jetty" % "jetty-servlet" % "7.5.4.v20111024"

libraryDependencies += "org.eclipse.jetty" % "jetty-server" % "7.5.4.v20111024"

libraryDependencies += "javax.servlet" % "servlet-api" % "2.5" % "provided"
