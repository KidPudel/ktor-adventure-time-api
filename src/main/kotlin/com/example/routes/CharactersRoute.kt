package com.example.routes

import com.example.common.Constants.BASE_URL
import com.example.data.models.Character
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private val characters = listOf(
    Character(
        "Finn Mertens",
        "Finn",
        "Human",
        17,
        "Male",
        listOf("Mathematical!", "Whoa! Algebraic!"),
        "$BASE_URL/characters_images/finn_pixel.png"
    ),
    Character(
        "Simon Petrikov",
        "Ice King",
        "Human/Ice Wizard",
        1046,
        "Male",
        listOf("Ladies! I brought you a baby, and a puppy!", "I love you too . . . Gunter."),
        "$BASE_URL/characters_images/finn_pixel.png"
    )
)

fun Route.charactersRoute() {
    // add a http method to GET characters
    get("/characters") {
        call.respond(
            status = HttpStatusCode.OK,
            characters
            )
    }
}