package kia

data class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val books = listOf(
            Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchet")),
            Book("Good Omens", listOf("Terry Pratchet", "Neal Gaiman")))

    println(books.flatMap { it.authors }.toSet())

    val lists = books.map { it.authors }
    println(lists.flatten())
}