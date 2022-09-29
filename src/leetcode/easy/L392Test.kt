package leetcode.easy

import junit.framework.Assert.assertEquals
import org.junit.Test

class L392Test {
    @Test
    fun isSubsequenceA() {
        assertEquals(isSubsequence("b", "abc"), true)
    }

    @Test
    fun isSubsequenceB() {
        assertEquals(isSubsequence("abs", ""), false)
    }

    @Test
    fun isSubsequenceC() {
        assertEquals(isSubsequence("", ""), true)
    }

    @Test
    fun isSubsequenceD() {
        assertEquals(isSubsequence("", "abc"), true)
    }

    @Test
    fun isSubsequenceE() {
        assertEquals(isSubsequence("abc", "ahbgdc"), true)
    }

    @Test
    fun isSubsequenceF() {
        assertEquals(isSubsequence("ab", "baab"), true)
    }

    @Test
    fun isSubsequenceG() {
        assertEquals(isSubsequence("q", "qqq"), true)
    }

    @Test
    fun isSubsequenceH() {
        assertEquals(isSubsequence("hhab", "hhaab"), true)
    }

    @Test
    fun isSubsequenceI() {
        assertEquals(isSubsequence("letcode", "ylyeyeytycyoydyey"), true)
    }

    @Test
    fun isSubsequenceJ() {
        assertEquals(isSubsequence("axc", "ahbgdc"), false)
    }
}