fun main() {
    println("Type an integer:")
    val input = readLine()!!.toInt()
    var result: Int = 1

    for (i in 1..input) {
        result *= i.toInt()
    }
    println("The factorial of $input = $result")
}