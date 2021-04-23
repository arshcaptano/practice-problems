package leetcode.medium


fun main() {
    val s = "  Bob    Loves  Alice   "
    println(reverseWords(s))
}

fun reverseWords(s: String): String {
    var rs = ""

    if (!s.trim().contains(" "))
        return s

    val first = s.trim().indexOfLast { space -> space == ' ' }
    val last = s.trim().length - 1
    rs = s.trim().substring(first, last + 1).trim() + " " + rs
    rs += reverseWords(s.trim().substring(0, first))

    return rs.trim()
}