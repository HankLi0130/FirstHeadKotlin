package ch2

import other.JavaPerson
import other.KotlinPerson

fun main(args: Array<String>) {

    // Java class
    val javaPerson = JavaPerson("James Gosling")

    // Kotlin class
    val kotlinPerson = KotlinPerson("JetBrains")

    println("Java Person Name: ${javaPerson.name}")

    println("Kotlin Person Name: ${kotlinPerson.name}")
}