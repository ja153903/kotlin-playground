package etrade

fun transformList(list: Array<String>): MutableCollection<MutableList<String>?> {
    val mapping = mutableMapOf<String, MutableList<String>?>()

    val transformation = { str: String ->
        val s = str.toLowerCase().toCharArray()
        s.sort()
        s.joinToString(separator = "")
    }

    for (elem in list) {
        val trans = transformation(elem)
        if (!mapping.containsKey(trans)) {
            mapping[trans] = mutableListOf(elem)
        } else {
            val currentList = mapping[trans]
            currentList?.add(elem)
            mapping[trans] = currentList
        }
    }

    return mapping.values
}

fun groupBySolution(list: List<String>): Collection<List<String>> {
    val transformation = { str: String ->
        val s = str.toLowerCase().toCharArray()
        s.sort()
        s.joinToString(separator = "")
    }
    return list.groupBy { transformation(it) } .values
}

fun main(args: Array<String>) {
    val list = arrayOf("Tokyo", "London", "Kyoto", "Donlon", "Miami")
    val result = transformList(list)
    result.map { println(it) }

    val result2 = groupBySolution(list.toList())

}