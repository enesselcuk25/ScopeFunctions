data class Person3(var name: String, var age: Int = 0, var city: String = "")

fun apply() {
    val adam = Person3("Enes").apply {
        age = 22
        city = "erzurum"
    }
    println(adam)
}

fun also() {
    val numbers = mutableListOf("one", "two", "three")
    numbers.also {
        println("The list elements before adding new one: $it")
    }.add("four")
}

fun main() {
    also()
}