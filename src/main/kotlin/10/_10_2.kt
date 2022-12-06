fun main(args : Array<String>) {
    val words = mutableListOf("Jim", "Mary", "Matt", "Priscilla", "Mike", "Kelly")
    println(words.count { it.startsWith("M") })
}