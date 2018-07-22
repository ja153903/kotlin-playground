package kia

fun alphabet(): String {
    val sb = StringBuilder()
    return with (sb) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        this.toString()
    }
}

fun main(args: Array<String>) {
    val alphabets = alphabet()
    println(alphabets)
}