package leetcode.medium

fun main() {
    val sList = listOf(
        "3[a]2[bc]", // PASS
        "3[a2[c]]", // PASS
        "2[abc]3[cd]ef", // PASS
        "abc3[cd]xyz", // PASS
        "100[leetcode]", // PASS
        "2[ab3[cd]]4[xy]", // FAIL
        "3[z]2[2[y]pq4[2[jk]e1[f]]]ef" // PASS
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

            charCount = "0"
            count = 0
            temp = StringBuilder()
            isDecoding = false
        } else {
            if (!s[i].isDigit()) {
                if (isDecoding)
                    temp.append(s[i])
                else
                    sb.append(s[i])
            } else {
                if (isDecoding) {
                    val st = s.substring(i)
                    val uv = st.substringBeforeLast(']')
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
    for (j in 1..count) {
        sb.append(temp)
    }
    return sb.toString()
}