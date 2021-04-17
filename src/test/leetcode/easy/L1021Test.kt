package test.leetcode.easy

import junit.framework.Assert.assertEquals
import leetcode.easy.removeOuterParentheses
import leetcode.medium.decodeString
import org.junit.Test

class L1021Test {
    @Test
    fun removeOuterParenthesesA() {
        assertEquals("()()()", removeOuterParentheses("(()())(())"))
    }

    @Test
    fun removeOuterParenthesesB() {
        assertEquals("()()()()(())", removeOuterParentheses("(()())(())(()(()))"))
    }

    @Test
    fun removeOuterParenthesesC() {
        assertEquals("", removeOuterParentheses("()()"))
    }
}