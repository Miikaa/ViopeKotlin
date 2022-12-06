fun main(args: Array<String>) {
    // Create an object
    var shp = Shape()
    shp.print()
}

class Shape() {
    // Class properties
    private var xPos: Int = 0
    private var yPos: Int = 0

    fun print() {
        println("Position: x=$xPos, y=$yPos")
    }
}