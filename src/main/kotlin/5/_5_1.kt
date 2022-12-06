fun isPalindromeString(inputStr: String): Boolean {
    val word = StringBuilder(inputStr)
    var lowerCaseWord = word.toString().toLowerCase()
    var reverseStr = lowerCaseWord.reversed()

    //compare reversed string with input string
    return lowerCaseWord.equals(reverseStr)
}

//Main function, Entry Point of Program
fun main(args: Array<String>) {
    println("Type a word:")
    val word = readLine()!!.toString()

    //Call function to check String
    if (isPalindromeString(word)) {
        println("The word $word is palindrome")
    } else {
        println("The word $word is not palindrome")
    }
}