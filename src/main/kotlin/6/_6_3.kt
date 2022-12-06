fun main(args: Array<String>) {
    val numbers = arrayOf(11, 16, 7, 8, 14, 5, 9, 3)
    var sum = 0
    for (num in numbers) {
        sum += num
    }

    val average: Float = (sum.toFloat() / numbers.size.toFloat())
    println("Average = $average")
}