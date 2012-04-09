package com.github.scalaweb

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport
import org.fusesource.scalate.layout.DefaultLayoutStrategy
import javax.servlet.ServletConfig

class MainServlet extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType = "text/html"
    templateEngine.layout("index.scaml")
  }

  override def init(config: ServletConfig) {
    super.init(config)
    val strategy = new DefaultLayoutStrategy(templateEngine, "scalate/layouts/default.scaml")
    templateEngine.layoutStrategy = strategy
  }
}
