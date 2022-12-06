import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    println("Type the first number:")
    val firstNumber = input.nextInt()
    println("Type the second number:")
    val secondNumber = input.nextInt()
    println("Type the operator (+,-,*):")
    val operator = input.next()

    when(operator) {
        "+" -> println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")
        "-" -> println("$firstNumber - $secondNumber = ${firstNumber - secondNumber}")
        "*" -> println("$firstNumber * $secondNumber = ${firstNumber * secondNumber}")
        else -> println("Unknown")
    }
}