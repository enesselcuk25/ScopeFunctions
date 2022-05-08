private fun numbers() {
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("it contains $size elements")
    }
}

private fun otherNumbers() {
    val numbers = mutableListOf("one", "two", "three")
    val firstAndLands = with(numbers) {
        "'with' is called with argument $this" +
                "it contains $size elements"
    }
    println(firstAndLands)
}

fun main() {
    otherNumbers()
//    numbers()
}