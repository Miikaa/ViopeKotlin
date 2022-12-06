fun main(args: Array<String>) {
    var ints = arrayOf(1, 2, 3, 4)
    try {
        println(ints[7])
    }
    catch(e: Exception) {
        println("Element not found. Index out of bounds")
    }

}