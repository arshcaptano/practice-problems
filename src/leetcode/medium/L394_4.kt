package leetcode.medium

fun main() {
    val sList = listOf(
//        "3[a]2[bc]", // PASS
//        "3[a2[c]]", // PASS
//        "2[abc]3[cd]ef", // PASS
//        "abc3[cd]xyz", // PASS
//        "100[leetcode]", // PASS
//        "2[ab3[cd]]4[xy]",
        "3[z]2[2[y]pq4[2[jk]e1[f]]]ef"
    )

    for (i in sList.indices)
        println(decodeString(sList[i]))

}

private fun decodeString(s: String): String {
    val sb = StringBuilder()
    var temp = StringBuilder()
    var charCount = "0"
    var count = 0
    var isDecoding = false

    var i = 0
    while (i < s.length) {
        if (s[i] == '[') {
            isDecoding = true
            i++
            continue
        } else if (s[i] == ']') {
            for (j in 1..count) {
                sb.append(temp)
            }

            temp = StringBuilder()
            charCount = "0"
            count = 0
            isDecoding = false
        } else {
            if (!s[i].isDigit()) {
                if (isDecoding)
                    temp.append(s[i])
                else
                    sb.append(s[i])
            } else {
                if (isDecoding) {
                    val st = s.substring(i - 2)
                    val indexStart = st.indexOf(']')
                    val indexEnd = getDepth(st)
                    val uv = if (indexStart == -1) return st else st.substring(0, indexStart + indexEnd)

                    temp.append(decodeString(uv))
                    i += uv.length - 1
                } else {
                    charCount += s[i]
                    count = (charCount).toInt()
                }

            }
        }
        i++
    }
//    for (j in 1..count) {
    sb.append(temp)
//    }
    return sb.toString()
}

private fun getDepth(s: String): Int {
    var open = 0
    var close = 0

    for (i in s.indices) {
        if (s[i] == '[') open++
        else if (s[i] == ']') close++
    }

    return kotlin.math.abs(open - close)
}

/*
   val st = s.substring(i)
                    val indexStart = st.indexOf(']')
                    val indexEnd = getDepth(st)
                    val uv = if (indexStart == -1) return st else st.substring(0, indexStart + indexEnd)

                    temp.append(decodeString(uv))
                    i += uv.length - 1
 */
