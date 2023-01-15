# ktor-adventure-time-api
This is the simple Adventure Time API for getting characters, that i've developed for my Adventure Time Charactes android app.

# How to use it?

## 1. To get characters list use following route:  
`http://(your local ip address):8080/characters`

and you'll get something like this:  
```json
[
  {
    "fullName": "Finn Mertens",
    "name": "Finn",
    "species": "Human",
    "age": 17,
    "sex": "Male",
    "quotes": [
    "Mathematical!",
    "Whoa! Algebraic!"
    ],
    "image": "http://192.168.1.8:8080/characters_images/finn_pixel.png"
  },
  {
    "fullName": "Simon Petrikov",
    "name": "Ice King",
    "species": "Human/Ice Wizard",
    "age": 1046,
    "sex": "Male",
    "quotes": [
    "Ladies! I brought you a baby, and a puppy!",
    "I love you too . . . Gunter."
    ],
    "image": "http://192.168.1.8:8080/characters_images/ice_king_pixel.png"
  }
]
```

## 2. To get specified character, use the following route:
`http://(your local ip address):8080/character/{name of the character}`

example response:  

```json
{
   "fullName": "Finn Mertens",
   "name": "Finn",
   "species": "Human",
   "age": 17,
   "sex": "Male",
   "quotes": [
   "Mathematical!",
   "Whoa! Algebraic!"
   ],
   "image": "http://192.168.1.8:8080/characters_images/finn.png"
}
```
