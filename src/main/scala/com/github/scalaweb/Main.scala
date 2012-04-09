package com.github.scalaweb

import org.eclipse.jetty.server.handler.ContextHandlerCollection
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.server.Server

object Main {

  def main(args: Array[String]) {
    val server = new Server(8080)
    val handlers = new ContextHandlerCollection

    val webappHandler = new ServletContextHandler(ServletContextHandler.SESSIONS)
    webappHandler.setContextPath("/")
    webappHandler.setResourceBase("src/main/webapp/")
    webappHandler.addServlet(classOf[MainServlet], "/*")
    handlers.addHandler(webappHandler)
    server.setHandler(handlers)
    server.start()
    server.join()
  }

}
