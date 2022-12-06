fun main(args: Array<String>) {
    println("Type the first integer:")
    val firstInt = readLine()!!.toInt()
    println("Type the second integer:")
    val secondInt = readLine()!!.toInt()
    println("Type the third integer:")
    val thirdInt = readLine()!!.toInt()

    println("The largest one is: ${findMax(firstInt, secondInt, thirdInt)}")
}

fun findMax(firstInt: Int, secondInt: Int, thirdInt: Int): Int{
    if(firstInt>=secondInt && firstInt>=thirdInt)  {
        return firstInt
    } else if  (secondInt>=firstInt && secondInt>=thirdInt)  {
        return secondInt
    } else  {
        return thirdInt
    }
}