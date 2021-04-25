package leetcode.hard


fun main() {
    val nums = intArrayOf(1)

    println(firstMissingPositive(nums))
}

fun firstMissingPositive(nums: IntArray): Int {
    if (nums.isEmpty()) return 1

    val set = HashSet<Int>()

    for (num in nums)
        set.add(num)

    for (i in 1 until Int.MAX_VALUE) {
        if (!set.contains(i))
            return i
    }

    return 1
}