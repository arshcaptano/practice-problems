package test.leetcode.medium

import junit.framework.Assert.assertEquals
import leetcode.medium.decodeString
import org.junit.Test

class L394Test {
    @Test
    fun decodeStringReturnsGenericResponseA() {
        assertEquals("aaabcbc", decodeString("3[a]2[bc]"))
    }

    @Test
    fun decodeStringReturnsGenericResponseB() {
        assertEquals("accaccacc", decodeString("3[a2[c]]"))
    }

    @Test
    fun decodeStringReturnsGenericResponseC() {
        assertEquals("abcabccdcdcdef", decodeString("2[abc]3[cd]ef"))
    }

    @Test
    fun decodeStringReturnsGenericResponseD() {
        assertEquals("abccdcdcdxyz", decodeString("abc3[cd]xyz"))
    }

    @Test
    fun decodeStringReturnsGenericResponseE() {
        assertEquals(
            "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode",
            decodeString("100[leetcode]")
        )
    }

    @Test
    fun decodeStringReturnsGenericResponseF() {
        assertEquals("abcdcdcdabcdcdcdxyxyxyxy", decodeString("2[ab3[cd]]4[xy]"))
    }

    @Test
    fun decodeStringReturnsGenericResponseG() {
        assertEquals(
            "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef",
            decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef")
        )
    }

    @Test
    fun decodeStringReturnsGenericResponseH() {
        assertEquals(
            "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef",
            decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef")
        )
    }

    @Test
    fun decodeStringReturnsGenericResponseI() {
        assertEquals("abcbcbcbcbcbcbcbcbcbcabcbcbcbcbcbcbcbcbcbcabcbcbcbcbcbcbcbcbcbc", decodeString("3[a10[bc]]"))
    }
}