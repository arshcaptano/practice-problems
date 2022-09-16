package leetcode.medium

fun main() {
    val output = decompressRLElistAttemptTwo(intArrayOf(1, 2, 3, 4))
    for (out in output)
        print(out)
}

fun decompressRLElist(nums: IntArray): IntArray {
    val output = mutableListOf<Int>()

    var i = 0
    while (i < nums.size) {
        for (j in 1..nums[i])
            output.add(nums[i + 1])

        i += 2
    }

    return output.toIntArray()
}

fun decompressRLElistAttemptTwo(nums: IntArray): IntArray {
    var outputSize = 0

    for (i in nums.indices step 2)
        outputSize += nums[i]

    println(outputSize)

    val output = IntArray(outputSize)

    var counter = 0 // 1, 2, 3, 4
    var outputIndex = 0

    while (counter < nums.size) {
        val freq = nums[counter]
        val value = nums[counter + 1]

        for (k in 0 until freq) {
            output[outputIndex] = value
            outputIndex++
        }

        counter += 2
    }

    return output
}