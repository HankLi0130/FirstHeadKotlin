package ch1

// data class, nullable type, default for argument
data class Person(val name: String,
                  val age: Int? = null)

// top level function
fun main(args: Array<String>) {

    val persons = listOf(
            Person("Alice"),
            Person("Bob", age = 29) // named argument
    )

    // lambda, "elvis" operator
    val oldest = persons.maxBy { it.age ?: 0 }

    println("The oldest is: $oldest")
}