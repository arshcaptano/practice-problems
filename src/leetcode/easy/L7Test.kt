package leetcode.easy

import junit.framework.Assert.assertEquals
import leetcode.easy.removeOuterParentheses
import leetcode.medium.decodeString
import org.junit.Test

class L7Test {
    @Test
    fun reverseA() {
        assertEquals(7, reverse(7))
    }

    @Test
    fun reverseB() {
        assertEquals(77, reverse(77))
    }

    @Test
    fun reverseC() {
        assertEquals(2011, reverse(1102))
    }

    @Test
    fun reverseD() {
        assertEquals(-321, reverse(-123))
    }

    @Test
    fun reverseE() {
        assertEquals(21, reverse(120))
    }

    @Test
    fun reverseF() {
        assertEquals(-21, reverse(-120))
    }
}