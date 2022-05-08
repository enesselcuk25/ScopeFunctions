import kotlin.random.Random

 data class Person(val name: String, var age: Byte = 0, var city: String = "") {
    fun moveTo(newCity: String) {
        city = newCity
    }

    fun incrementAge() {
        age++
    }
}

private fun scope() {
    Person("Enes", 22, "erzurum").let {
        println(it)
        it.moveTo("Hınıs")
        it.incrementAge()
        println(it)
    }
}

/*------------------------------------------------------------------------------------------------------*/
private fun thisOrIt() {
    var str = "hi"
    /**
     * this ile çalıştığında doğrudan fonck. ulaşabiliyoruz
     * it ile doğrudan fonck. ulaşamıyoruz it ile belirtip ulaşabiliriz
     */
    str.run {
        println("the string's lenght $length")
    }

    str.let {
        println("the string lenghts is ${it.length}")
    }
}

/*------------------------------------------------------------------------------------------------------*/
private fun thisKeywordu() {
    /**
     * this ile çalıştığında doğrudan ulaşabilrsin değişkenlere
     */
    val adam = Person("enes").apply {
        age = 22
        city = "erzurum"
    }
    println(adam)
}
/*---------------------------------------------------------------------------------------------------*/

private fun writeToLog(message: String) {
    println("info $message")
}

private fun getRandomInt(): Int {
    return Random.nextInt(100).also {
        writeToLog("geRandomInt() generated value $it")
    }
}

/*------------------------------------------------------------------------------------------------------*/
private fun contextObject() {
    /**
     * içi içe context objeleri çağrııldı it belirtlilen ve this ile belirtilen
     */
    val numberList = mutableListOf<Double>()
    numberList.also {
        println("populating  the list")
    }.apply {
        add(2.71)
        add(2.8)
        add(8.9)
    }.also {
        println("Sorting the list")
    }.sort()

}
/*------------------------------------------------------------------------------------------------------*/

private fun lambdaResult() {
    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count {
            it.endsWith("e")
        }
    }
    println("There are $countEndsWithE elements that end with e.")
}
/*------------------------------------------------------------------------------------------------------*/

fun main() {
//    getRandomInt()
    // scope()
    //   contextObject()
    lambdaResult()
}