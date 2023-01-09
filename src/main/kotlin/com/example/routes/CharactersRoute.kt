package com.example.routes

import com.example.common.Constants
import com.example.common.Constants.BASE_URL
import com.example.data.models.Character
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.charactersRoute() {
    // add a http method to GET characters
    get("/characters") {
        call.respond(
            status = HttpStatusCode.OK,
            message = Constants.characters
        )
    }
}