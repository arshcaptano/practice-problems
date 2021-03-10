package easy


fun main() {
    val s = "{}"
    println(isValid(s))
}

fun isValid(s: String): Boolean {
    if (s.length <= 1) return false

    val stack = ArrayDeque<Char>()
    val map = HashMap<Char, Char>()
    map[')'] = '('
    map['}'] = '{'
    map[']'] = '['

    for (i in s.indices) {
        if (!stack.isEmpty() && stack.last() == map[s[i]]) stack.removeLast()
        else stack.add(s[i])
    }

    return stack.isEmpty()
}


fun isValid2(s: String): Boolean {
    if (s.length <= 1) return false

    val stack = ArrayDeque<Char>()

    for (i in s.indices) {
        if (!stack.isEmpty() && stack.last() == getOpener(s[i])) stack.removeLast()
        else stack.add(s[i])
    }

    return stack.isEmpty()
}

fun getOpener(c: Char): Char? {
    return when (c) {
        ')' -> '('
        '}' -> '{'
        ']' -> '['
        else -> null
    }
}