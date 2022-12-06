fun main(args: Array<String>) {
    var input: String = ""
    var sum = 0
    while (input != "x") {
        println("Type a word (Type x to exit)")
        input = readLine()!!
        if (input != "x")
            sum++
    }
    println("You typed $sum words")
}