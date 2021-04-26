package leetcode.easy

import java.lang.StringBuilder

fun main() {
    val x = -1102
    println(reverse(x))
}

fun reverse(x: Int): Int {
    if (x == 0) return 0

    val sign = if (x < 0) -1 else 1
    var reverse = 0
    var y = sign * x

    while (y > 0) {
        val temp = y % 10
        if (reverse > (Int.MAX_VALUE - temp) / 10) {
            return 0
        }
        reverse = reverse * 10 + temp
        y /= 10
    }
    return reverse * sign
}

fun reverseA(x: Int): Int {
    val sb = StringBuilder()
    val s = x.toString()
    var prefix = "+"

    for (i in s.length - 1 downTo 0) {
        if (s[i] == '+' || s[i] == '-')
            prefix = s[i].toString()
        else
            sb.append(s[i])

        if (sb.toString().toLong() < Int.MIN_VALUE || sb.toString().toLong() > Int.MAX_VALUE)
            return 0
    }

    return (prefix + sb).toInt()
}