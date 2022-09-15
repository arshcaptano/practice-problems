package leetcode.medium

fun main() {
    val output = searchInsert(intArrayOf(1, 3, 5), 6)
    print(output)
}

fun searchInsert(nums: IntArray, target: Int): Int {
    if (target > nums[nums.size - 1])
        return nums.size

    var output = nums.size
    for (i in nums.indices) {
        if (nums[i] >= target) {
            output = i
            break
        }
    }

    return output
}