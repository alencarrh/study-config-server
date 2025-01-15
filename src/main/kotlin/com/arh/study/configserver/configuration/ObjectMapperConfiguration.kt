package com.arh.study.configserver.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.kotlinModule
import java.text.SimpleDateFormat
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class ObjectMapperConfiguration {

  @Bean
  @Primary
  fun objectMapper(): ObjectMapper {
    val mapper = ObjectMapper()
    mapper.registerModule(kotlinModule())
    mapper.registerModule(JavaTimeModule())
    mapper.dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    return mapper
  }
}
