package leetcode.easy

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class L1Test {
    @Test
    fun twoSumA() {
        assertArrayEquals(intArrayOf(0, 1), twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun twoSumB() {
        assertArrayEquals(intArrayOf(1, 2), twoSum(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun twoSumC() {
        assertArrayEquals(intArrayOf(0, 1), twoSum(intArrayOf(3, 3), 6))
    }

    @Test
    fun twoSumD() {
        assertArrayEquals(intArrayOf(1,2), twoSum(intArrayOf(2,5,5,11), 10))
    }
}