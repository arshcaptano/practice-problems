package leetcode.medium

fun main() {
    val nums = intArrayOf(2, 2, 2, 3)
    println(singleNumber(nums))
}

fun singleNumberA(nums: IntArray): Int {
    val map = HashMap<Int, Int>()

    for (i in nums.indices) {
        if (map.containsKey(nums[i]))
            map[nums[i]] = map[nums[i]]!! + 1
        else
            map[nums[i]] = 1
    }

    return map.filterValues { it == 1 }.keys.first()
}

fun singleNumber(nums: IntArray): Int {
    nums.sort()

    var i = 0
    while (i < nums.size) {
        if (i == nums.size - 1)
            return nums[i]

        if (nums[i] == nums[i + 1]) {
            i += 3
            continue
        } else {
            return nums[i]
        }
    }

    return 0
}