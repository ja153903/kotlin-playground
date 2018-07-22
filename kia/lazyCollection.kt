package kia

data class Person(val name: String, val company: Company?)

fun main(args: Array<String>) {
    val people = listOf<Person>(
            Person("Jaime", null),
            Person("Jenny", null),
            Person("Jimmy", null),
            Person("Alex", null),
            Person("Aria", null))

    val namesStartWithA = people.map(Person::name).filter { it.startsWith("A") }

    println(namesStartWithA)

    /*
    The implementation above is not efficient
     */

    val eff = people.asSequence()
            .map(Person::name)
            .filter { it.startsWith("A") }
            .toList()

    println(eff)

    /*
    More lazy eval
     */

    val eff2 = people.asSequence()
            .filter { it.name.length < 4 }
            .map(Person::name)
            .toList()

    println(eff2)

    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
}