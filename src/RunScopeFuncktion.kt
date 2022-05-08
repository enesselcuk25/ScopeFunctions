class MultipartService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default Request"
    fun query(request: String): String = "result for query '$request'"
}

private fun service() {
    val service = MultipartService("https://example.kotlinlang.org", 80)

    val result = service.run {
        port = 8080
        query(prepareRequest() + " to    port $port")
    }

    val letResult = service.let {
        it.port = 8080
        it.query(it.prepareRequest() + "to port ${it.port}")
    }
    println(result)
    println(letResult)
}
/*-----------------------------------------------------------------------------------------------------*/

fun hexNumberRegex() {
    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+123 -FFFF !%*& 88 XYZ")) {
        println(match.value)
    }
}

fun main() {
    hexNumberRegex()
//    service()
}