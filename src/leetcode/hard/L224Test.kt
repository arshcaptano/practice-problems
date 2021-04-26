package leetcode.hard

import junit.framework.Assert.assertEquals
import leetcode.easy.removeOuterParentheses
import leetcode.medium.decodeString
import org.junit.Test

class L224Test {
    @Test
    fun calculateA() {
        assertEquals(2, calculate("1 + 1"))
    }

    @Test
    fun calculateB() {
        assertEquals(3, calculate(" 2-1 + 2 "))
    }

    @Test
    fun calculateC() {
        assertEquals(23, calculate("(1+(4+5+2)-3)+(6+8)"))
    }
}