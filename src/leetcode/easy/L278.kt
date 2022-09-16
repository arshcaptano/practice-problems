package leetcode.easy

import kotlin.math.floor

fun main() {
    val output = A().firstBadVersion(9)
    print(output)
}

class A {
    var lastVersion = 1
    var min = 1
    var max = 1

    fun firstBadVersionFirst(n: Int): Int {
        max = n

        val version = (floor((min + max / 2).toDouble())).toInt()

        if (isBadVersion(version)) {
            // Go left
            if (!isBadVersion(version - 1) && isBadVersion(version))
                return version
            else {
                max = version
                firstBadVersion(max)
            }
        } else {
            // Go right
            if (!isBadVersion(version - 1) && isBadVersion(version))
                return version
            else {
                min = version
                max = n
                firstBadVersion(max)
            }
        }

        return lastVersion
    }

    fun firstBadVersion(n: Int): Int {
        var start = 0
        var end = n - 1
        if (n == 1) return 1

        while (start <= end) {
            val mid = start + (end - start) / 2

            if (isBadVersion(mid)) end = mid - 1
            else start = mid + 1
        }

        return start
    }

    private fun isBadVersion(n: Int): Boolean {
        return n >= 7
    }
}

/*
1 Good
2 Good
3 Good
4 Good
5 Good
6 Good
7 Bad
8 Bad
9 Bad

2126753390
1702766719

 */