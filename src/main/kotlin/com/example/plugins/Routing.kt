package com.example.plugins

import com.example.routes.charactersRoute
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        // call function in the routing configuration
        charactersRoute()

        // Static plugin. Try to access `/static/index.html`
        // to access static content - static("/static"), but i've deleted it to access without "/static"
        static {
            resources("static")
        }
    }
}
