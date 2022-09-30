package leetcode.easy


fun main() {
    println(getMinDistance(nums = intArrayOf(5, 3, 6), target = 5, start = 2))
}

fun getMinDistance(nums: IntArray, target: Int, start: Int): Int {
    var minLeft = nums.size - 1

    var i = start
    while (i < nums.size) {
        if (nums[i] == target) {
            minLeft = Math.min(minLeft, i - start)

            break
        }
        i++
    }

    var minRight = nums.size - 1

    var j = start
    while (j >= 0) {
        if (nums[j] == target) {
            minRight = Math.min(minRight, start - j)

            break
        }
        j--
    }

    return Math.min(minLeft, minRight)
}