fun main(args : Array<String>) {
    val words = mutableListOf("Kotlin", "Programming", "String", "List", "Algorith")
    val filteredWords = words.filter{ it.length < 7}
    println(filteredWords.toString())
}