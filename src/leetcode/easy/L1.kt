package leetcode.easy


fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    println(twoSum(nums, target))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val indices = IntArray(2)
    var sum = 0

    for (i in 0..nums.size) {
        if (nums[i] < target || sum + nums[i] == target) {
            if (sum == 0) indices[0] = i
            else indices[i] = i

            sum += nums[i]
        }

        if (sum == target)
            break

    }

    return indices
}