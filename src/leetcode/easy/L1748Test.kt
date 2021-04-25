package leetcode.easy

import junit.framework.Assert.assertEquals
import org.junit.Test

class L1748Test {
    @Test
    fun sumOfUniqueA() {
        assertEquals(4, sumOfUnique(intArrayOf(1, 2, 3, 2)))
    }

    @Test
    fun sumOfUniqueB() {
        assertEquals(0, sumOfUnique(intArrayOf(1, 1, 1, 1, 1)))
    }

    @Test
    fun sumOfUniqueC() {
        assertEquals(15, sumOfUnique(intArrayOf(1, 2, 3, 4, 5)))
    }
}