fun main(args: Array<String>) {
    var names = arrayOf<String>("Mary", "Paul", "Jane", "Phil", "John", "Jane", "Paul", "Anthony", "Mary")
    val dNames = names.distinct()
    println("There is ${dNames.count()} distinct names")
    names.sort()
    println("The first in the alphabetical order is ${names[0]}")
    names.reverse()
    println("The last in the alphabetical order is ${names[0]}")
}