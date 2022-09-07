package leetcode.easy

fun main() {
    val obj = NumArray(intArrayOf(-2, 0, 3, -5, 2, -1))
    val param = obj.sumRange(0, 3)
    println(param)
}

class NumArray(nums: IntArray) {
    var input = nums

    fun sumRange(left: Int, right: Int): Int {
        var sum = 0

        var start = left
        while (start <= right) {
            sum += input[start]
            start++
        }

        return sum
    }

}