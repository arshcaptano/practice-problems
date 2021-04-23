package leetcode.easy


fun main() {
    val nums = intArrayOf(2, 5, 5, 11)
    val target = 10

    println(twoSum(nums, target))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val indices = ArrayDeque<Int>()

    for (i in 0..nums.size) {
        indices.add(i)

        for (j in i + 1 until nums.size) {
            if (target - nums[i] == nums[j]) {
                indices.add(j)
                return indices.toIntArray()
            }
        }

        if (!indices.isEmpty())
            indices.removeLast()
    }

    return indices.toIntArray()
}