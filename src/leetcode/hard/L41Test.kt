package leetcode.hard

import junit.framework.Assert.assertEquals
import leetcode.easy.removeOuterParentheses
import leetcode.medium.decodeString
import org.junit.Test

class L41Test {
    @Test
    fun firstMissingPositiveA() {
        assertEquals(3, firstMissingPositive(intArrayOf(1, 2, 0)))
    }

    @Test
    fun firstMissingPositiveB() {
        assertEquals(2, firstMissingPositive(intArrayOf(3,4,-1,1)))
    }

    @Test
    fun firstMissingPositiveC() {
        assertEquals(1, firstMissingPositive(intArrayOf(7,8,9,11,12)))
    }

    @Test
    fun firstMissingPositiveD() {
        assertEquals(1, firstMissingPositive(intArrayOf(-1,-2,-3)))
    }

    @Test
    fun firstMissingPositiveE() {
        assertEquals(2, firstMissingPositive(intArrayOf(1)))
    }

    @Test
    fun firstMissingPositiveF() {
        assertEquals(1, firstMissingPositive(intArrayOf(0)))
    }
}