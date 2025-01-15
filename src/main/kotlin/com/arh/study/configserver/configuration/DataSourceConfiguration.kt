package com.arh.study.configserver.configuration

import javax.sql.DataSource
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class DataSourceConfiguration {
  @Bean
  @Primary
  @ConfigurationProperties(prefix = "spring.datasource")
  fun nupayDataSource(): DataSource {
    return DataSourceBuilder.create().build()
  }

  @Bean
  @FlywayDataSource
  @ConditionalOnProperty(prefix = "flyway", name = ["enabled"], matchIfMissing = true)
  @ConfigurationProperties(prefix = "spring.flyway.datasource")
  fun flywayDataSource(): DataSource {
    return DataSourceBuilder.create().build()
  }
}
