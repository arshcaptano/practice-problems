package leetcode.medium

fun main() {
    val sList = listOf(
        "3[a]2[bc]", // PASS
        "3[a2[c]]", // PASS
        "2[abc]3[cd]ef", // PASS
        "abc3[cd]xyz", // PASS
        "100[leetcode]", // PASS
        "2[ab3[cd]]4[xy]", // FAIL
        "3[z]2[2[y]pq4[2[jk]e1[f]]]ef" // PASS
    )

    for (i in sList.indices)
        println(decodeString(sList[i]))
}

private fun decodeString(s: String): String {
    val sb = StringBuilder()


    return sb.toString()
}
