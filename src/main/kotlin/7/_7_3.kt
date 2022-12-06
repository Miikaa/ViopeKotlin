fun main(args: Array<String>) {
    val firstName: String = "John"
    val lastName: String = "Johnson"

    println(printGreeting(firstName))
    println(printGreeting(firstName, lastName))
}

fun printGreeting(firstName: String): String{
    return "Hello $firstName"
}

fun printGreeting(firstName: String, lastName: String): String{
    return "Hello $firstName $lastName"
}