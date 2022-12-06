fun main(args: Array<String>) {
    var ints = arrayOf(2, 3, 4, 5)
    try {
        println("Type an index:")
        val index = readLine()!!.toInt()
        println(ints[index])
    } catch (e: NumberFormatException) {
        println("Type an integer")
    } catch(e: Exception) {
        println("Element not found. Index out of bounds")
    }
}