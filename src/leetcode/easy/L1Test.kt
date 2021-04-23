package leetcode.easy

import junit.framework.Assert.assertEquals
import org.junit.Test

class L1Test {
    @Test
    fun twoSumA() {
        assertEquals(intArrayOf(0, 1), twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun twoSumB() {
        assertEquals(intArrayOf(1, 2), twoSum(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun twoSumC() {
        assertEquals(intArrayOf(0, 1), twoSum(intArrayOf(3, 3), 6))
    }
}