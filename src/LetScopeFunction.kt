/**
 * numbers and numbers2 arasında pek bir fark yok sadece numbers1 let ile kullanılıdı
 * let ilede daha güzel kodları yazabilriz.
 * println yerine it kullanmak her daim daha iyi
 */

private fun numbers() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map {
        it.length
    }.filter {
        it > 3
    }
    println(resultList)
}

private fun numbers1() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map {
        it.length
    }.filter {
        it > 3
    }.let {
        println(it)
    }
    println(resultList)
}

/*-----------------------------------------------------------------------------------------------------*/

private fun lambda() {
    /**
     * it tek bir görevi varsa bunun yerine lambda :: kullanabiliriz
     */
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map {
        it.length
    }.filter {
        it > 3
    }.let(::println)

}
/*-----------------------------------------------------------------------------------------------------*/

private fun processNonNullString(str: String) {}
private fun non_null() {
    val str: String? = "hi"
    // processNonNullString(str)  // null hatası veriyor

    val length = str?.let {
        println("$it let() called on")
        processNonNullString(it)
        it.length
    }
    println(length)
}
/*-----------------------------------------------------------------------------------------------------*/

private fun otherGetNumbers() {
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")

        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")
}

fun main() {
    otherGetNumbers()
    //  non_null()
    // numbers()
}