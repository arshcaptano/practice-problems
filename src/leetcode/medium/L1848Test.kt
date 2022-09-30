package leetcode.medium

import junit.framework.Assert.assertEquals
import leetcode.easy.getMinDistance
import org.junit.Test

class L1848Test {
    @Test
    fun getMinDistanceA() {
        assertEquals(1, getMinDistance(nums = intArrayOf(1, 2, 3, 4, 5), target = 5, start = 3))
    }

    @Test
    fun getMinDistanceB() {
        assertEquals(0, getMinDistance(nums = intArrayOf(1), target = 1, start = 0))
    }

    @Test
    fun getMinDistanceC() {
        assertEquals(0, getMinDistance(nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1), target = 1, start = 0))
    }

    @Test
    fun getMinDistanceD() {
        assertEquals(2, getMinDistance(nums = intArrayOf(5, 3, 6), target = 5, start = 2))
    }

    @Test
    fun getMinDistanceE() {
        assertEquals(1, getMinDistance(nums = intArrayOf(1, 5, 3, 4, 5), target = 5, start = 2))
    }
}