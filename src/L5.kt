import java.lang.StringBuilder

fun main() {
    val s = "cbbd"
    println(longestPalindrome(s))
}

fun longestPalindrome(s: String): String {
    /*
    cbbd-> c, cb, cbb, cbbd
    bbd-> b, bb, bbd
    bd-> b, bd
     */
    val len = s.length
    var palindrome = ""

    if (len <= 1) return s

    var temp = StringBuilder()

    var i = 0
    var start = 0
    while (i < len) {
        temp.append(s[i])

        if (isPalindrome(temp.toString()) && temp.length > palindrome.length)
            palindrome = temp.toString()

        if (i == len - 1) {
            i = start++
            temp = StringBuilder()
        }

        i++
    }

    return palindrome
}

fun longestPalindrome2(s: String): String {
    val n = s.length
    var palindrome = ""
    var start = 0

    if (n <= 1) return s

    var temp = StringBuilder()
    for (i in start until n - 1) {
        val sub = s.substring(start)
        val nsub = sub.length

        for (j in 0 until nsub) {
            temp.append(sub[j])

            if (isPalindrome(temp.toString()) && temp.length > palindrome.length)
                palindrome = temp.toString()
        }

        start++
        temp = StringBuilder()
    }

    return palindrome
}

fun isPalindrome(s: String): Boolean {
    val n = s.length
    val reverse = StringBuilder()

    if (n <= 1) return true

    for (i in n - 1 downTo 0) {
        reverse.append(s[i])
    }

    return reverse.toString() == s
}