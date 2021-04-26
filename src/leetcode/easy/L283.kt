package leetcode.easy

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)
    moveZeroes(nums)
    println(nums.contentToString())
}

fun moveZeroes(nums: IntArray): Unit {
    var n = nums.size
    if (n <= 1) return

    var i = 0
    while (i < n) {
        if (nums[i] == 0) {
            for (j in i until n - 1) {
                nums[j] = nums[j + 1]
            }
            nums[n - 1] = 0
            n--
        } else {
            i++
        }
    }
}