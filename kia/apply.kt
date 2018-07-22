package kia

fun alphabetWithApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun main(args: Array<String>) {
    val alpha = alphabetWithApply()
    println(alpha)
}