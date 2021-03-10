import java.lang.StringBuilder

fun main() {
    val s = "cbbd"
    println(longestPalindrome(s))
}

fun longestPalindrome(s: String): String {
    /*
        cbbd -> c, cb , cbb, cbbd -> loop(1 + 2 + 3 + 4) : Total 4 + 10
        bbd -> b, bb, bbd -> loop(1 + 2 + 3) : Total 3 + 7
        bd -> b, bd - > loop(1 + 2) : Total 2 + 3

        Total operations 29 -> O(2^N)
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

fun longestPalindrome1(s: String): String {
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