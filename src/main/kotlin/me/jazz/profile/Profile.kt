package me.jazz.profile

class Profile (
    val id: Long,
    val login : String,
    val name : String,
    val surname : String,
    val status : String,
    val avatar : String
){
    val fullname
    get() = "$name $surname"
}


