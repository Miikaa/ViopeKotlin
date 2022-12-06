fun main(args : Array<String>) {
    val names = mapOf(1 to "Kotlin", 2 to "Java", 3 to "C#", 4 to "Javascript")
    println("Enter a programming language:")
    var programmingLanguage = readLine()

    if (names.containsValue(programmingLanguage)) {
        println("Value found")
    } else {
        println("Value not found")
    }
}