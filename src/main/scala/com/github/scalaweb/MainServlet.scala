package com.github.scalaweb

import org.scalatra.scalate.ScalateSupport
import org.fusesource.scalate.layout.DefaultLayoutStrategy
import org.scalatra.ScalatraServlet
import javax.servlet.ServletConfig

class MainServlet extends ScalatraServlet with ScalateSupport {

  get("/") {
    <H1>Hello</H1>
  }

  get("/:page") {
    println("matched page")
    contentType = "text/html"
    templateEngine.layout(params("page"))
  }

  override def init(config: ServletConfig) {
    super.init(config)
    println("Servlet init called")
    val strategy = new DefaultLayoutStrategy(templateEngine, "scalate/layouts/default.scaml")
    templateEngine.layoutStrategy = strategy
    templateEngine.templateDirectories ++= List("src/main/webapp/", "webapp/")
  }

//  override def init(filterConfig: FilterConfig) {
//    super.init(filterConfig)
//    val strategy = new DefaultLayoutStrategy(templateEngine, "scalate/layouts/default.scaml")
//    templateEngine.layoutStrategy = strategy
//  }
}
