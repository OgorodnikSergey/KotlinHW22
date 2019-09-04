package ru.netology.profile

import ru.netology.profile.model.Profile

fun main(args: Array<String>) {
    val user = Profile(100, "OSV", "Sergey", "Ogorodnik", true, "My Avatar")
    println(user.fullName)
}