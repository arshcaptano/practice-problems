package leetcode.medium

fun main() {
    val sList = listOf(
        //        "3[a]2[bc]", // PASS
        //        "3[a2[c]]", // PASS
        //        "2[abc]3[cd]ef", // PASS
        //        "abc3[cd]xyz", // PASS
        //        "100[leetcode]", // PASS
        //        "2[ab3[cd]]4[xy]", // PASS
        //        "3[z]2[2[y]pq4[2[jk]e1[f]]]ef" // PASS
        "3[a10[bc]]"
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
                    val sub = substring(i, s)

                    temp.append(decodeString(sub))

                    i += sub.length - 1
                } else {
                    charCount += s[i]
                    count = (charCount).toInt()
                }

            }
        }
        i++
    }
    for (j in 1..count) {
        sb.append(temp)
    }
    return sb.toString()
}

private fun substring(i: Int, s: String): String {
    val offset: Int
    val sub = s.substring(i)
    val newSub: String

    var open = 0
    var close = 0
    for (k in 0..sub.length) {
        if (sub[k].isDigit()) continue
        if (sub[k] == '[') open++
        else if (sub[k] == ']') close++

        if (kotlin.math.abs(open - close) == 0) {
            newSub = sub.substring(0, k + 1)
            return newSub
        }
    }

    offset = kotlin.math.abs(open - close)

    return if (offset == 0) {
        val indexStart = sub.lastIndexOf(']')
        if (indexStart == -1) return sub else sub.substring(0, indexStart)
    } else {
        val indexStart = sub.lastIndexOf("]", sub.lastIndexOf("]") + offset)
        if (indexStart == -1) return sub else sub.substring(0, indexStart)
    }

}