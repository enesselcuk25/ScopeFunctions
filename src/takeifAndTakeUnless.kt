import kotlin.random.Random

fun take() {
    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 }
    val oddOrNull = number.takeUnless {
        it % 2 == 0
    }

    println("even : $evenOrNull, odd : $oddOrNull")
}

/*-------------------------------------------------------------------------------------*/

fun take2() {
    val str = "helloo"
    val caps = str.takeIf {
        it.isNotEmpty()
    }?.uppercase()

    println(caps)
}
/*-------------------------------------------------------------------------------------*/

fun displaySubstringPosition(input: String, sub: String) {
    input.indexOf(sub).takeIf {
        it >= 0
    }?.let {
        println("The substring $sub is found in $input.")
        println("Its start position is $it.")
    }
}

fun main() {
    // take2()
    // take

    displaySubstringPosition("010000011", "11")
    displaySubstringPosition("010000011", "12")
}