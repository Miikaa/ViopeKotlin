fun main(args: Array<String>) {
    println("Type an integer:")
    val firstInt = readLine()!!.toInt()

    println("${isEven(firstInt)}")
}

fun isEven(firstInt: Int): String{
    if (firstInt % 2 == 0) {
        return "Even"
    } else {
        return "Odd"
    }
}