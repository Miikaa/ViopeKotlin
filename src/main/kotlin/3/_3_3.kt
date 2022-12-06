fun main(args: Array<String>) {
    println("Type an integer #1:")
    var firstInt = readLine()!!.toInt()
    println("Type an integer #2:")
    var secondInt = readLine()!!.toInt()

    println("$firstInt + $secondInt = ${firstInt + secondInt}")
    println("$firstInt - $secondInt = ${firstInt - secondInt}")
    println("$firstInt * $secondInt = ${firstInt * secondInt}")
}