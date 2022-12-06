fun main(args : Array<String>) {
    val nums = mutableListOf<Int>()
    var input = 0
    var sum: Double = 0.0
    while (input != -1) {
        println("Type a positive integer (-1 exits):")
        input = readLine()!!.toInt()
        if (input != -1 && input > 0) {
            sum += input
            nums.add(input)
        }
    }
    val average: Double = (sum.toDouble() / nums.size.toDouble())
    val max = nums.max() ?: 0
    val min = nums.min() ?: 0
    println("The average = $average")
    println("The max = $max")
    println("The min = $min")
}