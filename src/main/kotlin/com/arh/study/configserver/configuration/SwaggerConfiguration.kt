package com.arh.study.configserver.configuration

import io.swagger.v3.oas.annotations.Hidden
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.view.RedirectView

@Configuration
@RestController
class SwaggerConfiguration() {

  @Value("\${springdoc.swagger-ui.path}") lateinit var swaggerUiPath: String

  @GetMapping("/") @Hidden fun swagger(): RedirectView = RedirectView(swaggerUiPath)
}
