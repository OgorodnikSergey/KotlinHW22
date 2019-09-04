package ru.netology.hierarchy

import ru.netology.hierarchy.widget.TextView
import ru.netology.hierarchy.view.ViewGroup
import ru.netology.hierarchy.widget.Button

fun main(args: Array<String>) {

    val text = TextView("Some Text")
    text.click() // вызывается метод из `View`
    println(text.text) // Some Text
    text.text = "Something bad happened"
    println(text.text) // Something bad happened

    val button = Button("Click me")
    button.click() // вызывается метод из `View`
    println(button.text) // Click me
    button.text = "Don't click me"
    println(button.text) // Don't click me

// В результате вы должны иметь возможность создавать сколь иерархии View
    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
}