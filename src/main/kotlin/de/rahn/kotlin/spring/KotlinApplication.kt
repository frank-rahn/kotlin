package de.rahn.kotlin.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans
import org.springframework.web.servlet.function.ServerResponse
import org.springframework.web.servlet.function.router
import javax.sql.DataSource

@SpringBootApplication
class KotlinApplication

data class Freelancer(var fistName: String? = null, val name: String)

data class DBService(val db: DataSource)

fun run(args: Array<String>) {
  runApplication<KotlinApplication>(*args) {
    addInitializers(
      beans {
        bean {
          // Rest Server
          router {
            GET("/freelancers") {
              ServerResponse.ok()
                .body(arrayOf(Freelancer("Frank", "Rahn"), Freelancer("Martin", "Rahn")))
            }
            GET("/freelancers/{id}") {
              ServerResponse.ok().body(Freelancer(name = it.pathVariable("id")))
            }
          }
        }
//        bean {
//          // Get a Service mit DB-Zugriff
//          val db = ref<DataSource>()
//          DBService(db)
//        }
//        bean {
//          // Konfiguration: Websecurity
//          val http = ref<HttpSecurity>()
//          http {
//            httpBasic {}
//            authorizeRequests {
//              authorize("/freelancers/**", hasAuthority("ROLE_USER"))
//            }
//          }.run { http.build() }
//        }
//        bean {
//          // User
//          InMemoryUserDetailsManager(
//            User.withDefaultPasswordEncoder()
//              .username("user")
//              .password("password")
//              .roles("USER")
//              .build()
//          )
//        }
      }
    )
  }
}

//fun main(args: Array<String>) = run(args)
