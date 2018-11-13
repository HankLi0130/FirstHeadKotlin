package ch2

fun main(args: Array<String>) {

    val name = "Hank"

    println("Hi, I am " + name)

    println("Hi, I am $name")

    println("Hello, ${args[0]}")

    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}!")

}