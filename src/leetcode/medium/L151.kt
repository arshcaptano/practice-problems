package leetcode.medium


fun main() {
    val s = "  Bob    Loves  Alice   "
    println(reverseWords(s))
}

fun reverseWords(s: String): String {
    val rs = s.trim().split("\\s+".toRegex())
    val sb = StringBuilder()

    for (i in rs.size - 1 downTo 0)
        sb.append(rs[i] + " ")

    return sb.toString().trim()
}

fun reverseWordsA(s: String): String {
    var rs = ""

    if (!s.trim().contains(" "))
        return s
// "Bob    Loves  Alice"
    val first = s.trim().indexOfLast { space -> space == ' ' }
    val last = s.trim().length - 1
    rs = s.trim().substring(first, last + 1).trim() + " " + rs
    rs += reverseWords(s.trim().substring(0, first))

    return rs.trim()
}