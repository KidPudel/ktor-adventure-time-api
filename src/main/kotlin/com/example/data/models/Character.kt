package com.example.data.models

import kotlinx.serialization.Serializable

// To be able to parse the content of the class to json and send it over the network we need to add serializable attribute
@Serializable
data class Character(
    val fullName: String,
    val name: String,
    val species: String,
    val age: Int,
    val sex: String,
    val quotes: List<String>,
    val image: String
)
