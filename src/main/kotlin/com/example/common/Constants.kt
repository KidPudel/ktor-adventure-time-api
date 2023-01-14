package com.example.common

import com.example.data.models.Character

object Constants {
    // you can find it in terminal with ipconfig for windows and ifconfig for linux and unix and port in application.conf
    const val BASE_URL = "http://192.168.1.8:8080"

    val characters: List<Character> = listOf(
        Character(
            "Finn Mertens",
            "Finn",
            "Human",
            17,
            "Male",
            listOf("Mathematical!", "Whoa! Algebraic!"),
            "$BASE_URL/characters_images/finn.png"
        ),
        Character(
            "Jake the Dog",
            "Jake",
            "Dog/Shape-shifter hybrid",
            16,
            "Male",
            listOf(
                "Girl, you smell good. Did you take a bath in rainbows and cupcakes?",
                "Being crazy is hard. You’re getting all hung up, all hung up on imaginary problems. You gotta focus on what’s real, man."
            ),
            "$BASE_URL/characters_images/jake.png"
        ),
        Character(
            "Simon Petrikov",
            "Ice King",
            "Human/Ice Wizard",
            1046,
            "Male",
            listOf("Ladies! I brought you a baby, and a puppy!", "I love you too . . . Gunter."),
            "$BASE_URL/characters_images/ice_king.png"
        ),
        Character(
            "Lumpy Space Princess",
            "LSP",
            "Lumps Anti-Elemental",
            19,
            "Female",
            listOf(
                "WHATEVERS 2009!",
                "First you should check out my house. It's, like, kinda lame but way less lame than, like, your house."
            ),
            "$BASE_URL/characters_images/lsp.png"
        ),
        Character(
            "Be MOre",
            "BMO",
            "MO",
            1006,
            "Male",
            listOf(
                "Check, please.",
                "Finn, you're dumb- you're dumb- you're dumb- you're da man! This is gonna be a snap!"
            ),
            "$BASE_URL/characters_images/BMO.png"
        ),
        Character(
            "Bonnibel \"Bonnie\" Bubblegum",
            "PB",
            "Candy Elemental",
            830,
            "Female",
            listOf(
                "Check, please.",
                "Finn, you're dumb- you're dumb- you're dumb- you're da man! This is gonna be a snap!"
            ),
            "$BASE_URL/characters_images/pb.png"
        )
    )
}