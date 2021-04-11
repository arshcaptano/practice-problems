package leetcode.medium

fun main() {
//    val s = "3[a]2[bc]" // PASS
//    val s = "3[a2[c]]" // PASS
//    val s = "2[abc]3[cd]ef" // PASS
//    val s = "abc3[cd]xyz" // PASS
//    val s = "100[leetcode]" // PASS
    val s = "2[ab3[cd]]4[xy]" // FAIL
//    val s = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef" // PASS
    println(decodeString(s))
}

fun decodeStringx(s: String): String {
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
                    temp.append(decodeStringx(uv))
                    for (j in 1..count) {
                        sb.append(temp)
                    }
                    i += uv.length - 1
                } else {
                    charCount += s[i]
                    count = (charCount).toInt()
                }

            }
        }
        i++
    }
    return sb.toString()
}

fun decodeString(s: String): String {
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