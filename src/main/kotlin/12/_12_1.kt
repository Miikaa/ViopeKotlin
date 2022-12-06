import java.io.File

fun main(args : Array<String>) {
    var file = File("readme.txt")
    var text: String = ""
    while (text != "exit") {
        println("Type a line:")
        var text = readLine()
        if (text != "exit") {
            file.appendText(text.toString())
        }
        if (text == "exit")
            break
    }

    file.forEachLine { println(it) }

}