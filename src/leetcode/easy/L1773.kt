package leetcode.easy

fun main() {
    val items: List<List<String>> = listOf(
        listOf("phone", "blue", "pixel"),
        listOf("computer", "silver", "lenovo"),
        listOf("phone", "gold", "iphone")
    )
    println(countMatches(items, "color", "silver"))
}

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var count = 0

    for (i in items.indices) {
        when (ruleKey) {
            "type" -> if (items[i][0] == ruleValue) count++
            "color" -> if (items[i][1] == ruleValue) count++
            "name" -> if (items[i][2] == ruleValue) count++
        }
    }

    return count
}