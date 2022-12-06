// Will print errors cause the classes only exist on Viope
open class Shape {

}

class Circle: Shape() {
    var radius: Double = 0.0

    fun getArea(radius: Double): Double{
        return (radius * radius * 3.14159)
    }
}

fun main(args: Array<String>) {
    var crcl = Circle()
    crcl.radius = 5.5

    println("The area = ${crcl.getArea(crcl.radius)}")
}