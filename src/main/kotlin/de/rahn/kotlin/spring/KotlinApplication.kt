package de.rahn.kotlin.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans
import org.springframework.web.servlet.function.ServerResponse
import org.springframework.web.servlet.function.router

@SpringBootApplication
class KotlinApplication

data class Freelancer(var fistName: String? = null, val name: String)

fun run(args: Array<String>) {
    runApplication<KotlinApplication>(*args) {
        addInitializers(
            beans {
                bean {
                    router {
                        GET("/freelancers") {
                            ServerResponse.ok().body(arrayOf(Freelancer("Frank", "Rahn"), Freelancer("Martin", "Rahn")))
                        }
                        GET("/freelancers/{id}") {
                            ServerResponse.ok().body(Freelancer(name = it.pathVariable("id")))
                        }
                    }
                }
            }
        )
    }
}

//fun main(args: Array<String>) = run(args)
