package leetcode.medium

fun main() {
    merge(
        nums1 = intArrayOf(1, 2, 3, 0, 0, 0),
        m = 3,
        nums2 = intArrayOf(2, 5, 6),
        n = 3
    )

//    merge(
//        nums1 = intArrayOf(1),
//        m = 1,
//        nums2 = intArrayOf(),
//        n = 0
//    )
//
//    merge(
//        nums1 = intArrayOf(0),
//        m = 0,
//        nums2 = intArrayOf(1),
//        n = 1
//    )
}

/*
out = 3
[1, 2, 3, 0, 0, 0]
[2, 5, 6]

[1, 2, 2, 0, 0, 0]

2
*/

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    if (n == 0) return

    var out = 0

    for (i in 0 until m + n) {
        var mVal = 0
        var nVal = 0

        if (i < m) {
            mVal = nums1[i]
            out = nums1[i]
        }

        if (i < n) {
            nVal = nums2[i]
        }

        if (out > nVal) {
            nums1[i] = nVal
        } else if (out <= nVal) {
            nums1[i] = out
        }
        else {
            nums1[i] = mVal
        }
    }

    print(nums1.toList().toString())
}