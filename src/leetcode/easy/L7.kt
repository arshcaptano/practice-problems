package leetcode.easy

import java.lang.StringBuilder

fun main() {
    val x = -1102
    println(reverse(x))
}

fun reverse(x: Int): Int {
    val sb = StringBuilder()
    val s = x.toString()
    var prefix = "+"

    for (i in s.length - 1 downTo 0) {
        if (s[i] == '+' || s[i] == '-')
            prefix = s[i].toString()
        else
            sb.append(s[i])
    }

    return if (sb.toString().toLong() < Int.MIN_VALUE || sb.toString().toLong() > Int.MAX_VALUE)
        0
    else
        (prefix + sb).toInt()
}