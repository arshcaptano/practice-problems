package leetcode.easy

fun main() {
    val nums = intArrayOf(1, 1, 1, 1, 1)
    println(sumOfUnique(nums))
}

fun sumOfUnique(nums: IntArray): Int {
    val map = HashMap<Int, Boolean>()
    for (i in nums.indices) {
        if (map.isNotEmpty())
            map[nums[i]] = !map.contains(nums[i])
        else
            map[nums[i]] = true

    }

    var sum = 0
    for ((key, value) in map)
        if (value) sum += key

    return sum
}