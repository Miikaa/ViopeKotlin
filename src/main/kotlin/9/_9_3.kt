fun main(args : Array<String>) {
    for (priority in Priority.values()) {
        println("${priority.ordinal} : ${priority.name}")
    }
}

enum class Priority {
    LOW,
    MEDIUM,
    HIGH,
}