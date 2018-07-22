package kia

private class Employee(val name: String, val manager: Employee?)

private fun managerName(employee: Employee): String? = employee.manager?.name

/**
 * The elvis operator ?: allows us to set a value for
 * the case when the string is null
 */
fun foo(s: String?) {
    val t: String = s ?: ""
}

fun main(args: Array<String>) {
    val ceo = Employee("Da boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))
}