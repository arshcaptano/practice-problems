package leetcode.easy

import java.lang.StringBuilder

fun main() {
    val s = "Hello how are you Contestant"
    val k = 3
    println(truncateSentence(s, k))
}

fun truncateSentence(s: String, k: Int): String {
    val sb = StringBuilder()
    var count = 0

    for (i in s.indices) {
        if (s[i] == ' ')
            count++

        if (count == k)
            return sb.toString()

        sb.append(s[i])
    }

    return s
}