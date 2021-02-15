package io.url

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class UrlIoApplication

fun main(args: Array<String>) {
    runApplication<UrlIoApplication>(*args)
}
