package br.com.pedroyodasaito

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import java.util.*

@SpringBootApplication
@EnableFeignClients
class CleanArchitectureApplication {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            TimeZone.setDefault(TimeZone.getTimeZone("GMT-3"))
            runApplication<CleanArchitectureApplication>(*args)
        }
    }
}
