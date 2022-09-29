package leetcode.easy


fun main() {
    val s = listOf(
        "b",
        "abs",
        "",
        "",
        "abc",
        "ab",
        "q",
        "hhab",
        "letcode",
        "axc"
    )
    val t = listOf(
        "abc",
        "",
        "",
        "abc",
        "ahbgdc",
        "baab",
        "qqq",
        "hhaab",
        "ylyeyeytycyoydyey",
        "ahbgdc"
    )
    for (i in s.indices)
        println(isSubsequence(s[i], t[i]))
}

fun isSubsequence(s: String, t: String): Boolean {
    var j = 0
    if (s.isNotEmpty()) {
        for (c in t.toCharArray()) {
            if (s[j] == c)
                j++

            if (j == s.length) return true
        }

    }

    if (j == s.length) return true

    return false
}