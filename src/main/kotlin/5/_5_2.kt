fun main(args: Array<String>) {
    println("Type the first number:")
    val firstNumber = readLine()!!.toInt()
    println("Type the second number:")
    val secondNumber = readLine()!!.toInt()
    println("Type the third number:")
    val thirdNumber = readLine()!!.toInt()
    if(firstNumber>=secondNumber && firstNumber>=thirdNumber)  {
        println("The largest number = $firstNumber")
    } else if  (secondNumber>=firstNumber && secondNumber>=thirdNumber)  {
        println("The largest number = $secondNumber")
    } else  {
        println("The largest number = $thirdNumber")
    }
}