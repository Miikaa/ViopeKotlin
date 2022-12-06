import java.io.File

fun main(args : Array<String>) {
    val file = File("numbers.txt")
    file.createNewFile()
    val nums = mutableListOf<Int>()
    var sum = 0
    while (true) {
        println("Type a positive integer (-1 to exit):")
        val input = readLine()!!.toInt()
        if (input != -1) {
            if (input < 0) {
                println("The number must be positive")
                continue
            }
            file.appendText("$input\n")
            sum++
        }
        if (input == -1)
            break
    }
    file.forEachLine { nums.add(it.toInt()) }
    val average: Double = nums.average()
    println("You typed $sum numbers.")
    println("The average is $average.")
}