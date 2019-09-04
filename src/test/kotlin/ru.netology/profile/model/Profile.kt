package ru.netology.profile.model

class Profile(
    val id: Int,
    val login: String,
    val name: String,
    val secondName: String,
    val status: Boolean,
    val avatar: String
) {
    val fullName: String
        get() {
            return name + " " + secondName
        }
}