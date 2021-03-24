package leetcode.easy

import java.lang.StringBuilder

fun main() {
    val ss = arrayOf(
//        "(()())(())", // -> ()()()
        "(()())(())(()(()))", // -> ()()()()(()) // TODO
//        "()()" // ->
    )

    for (s in ss)
        println(removeOuterParentheses(s))
}

fun removeOuterParentheses(s: String): String {
    val sb = StringBuilder()
    val stack = ArrayDeque<Char>()

    for (i in s.indices) {
        when {
            stack.isEmpty() -> {
                stack.add(s[i])
            }
            stack.last() != s[i] -> {
                if (stack.size == 1) {
                    stack.removeLast()
                } else {
                    sb.append(stack.removeLast())
                    sb.append(s[i])
                }
            }
            else -> {
                stack.addLast(s[i])
            }
        }
    }

    return sb.toString()
}