fun main(args : Array<String>) {
    val prices = arrayOf(10,14,22,33,44,13,22,55,66,77)
    var input = -1
    var payment = 0
    var sum = 0
    println("Supermarket")
    println("===========")
    while (input != 0) {
        print("Please select product (1-10) 0 to Quit:")
        input = readLine()!!.toInt()
        if (input > 0) {
            sum += prices[input-1]
            println("Product: $input Price: ${prices[input - 1]}")
        }
    }
    println("Total: $sum")
    print("Payment: ")
    payment = readLine()!!.toInt()
    println("Change: ${payment - sum}")
}