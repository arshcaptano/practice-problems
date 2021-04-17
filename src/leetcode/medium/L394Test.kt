package leetcode.medium

import junit.framework.Assert.assertEquals
import leetcode.medium.decodeString
import org.junit.Test

class L394Test {
    @Test
    fun decodeStringA() {
        assertEquals("aaabcbc", decodeString("3[a]2[bc]"))
    }

    @Test
    fun decodeStringB() {
        assertEquals("accaccacc", decodeString("3[a2[c]]"))
    }

    @Test
    fun decodeStringC() {
        assertEquals("abcabccdcdcdef", decodeString("2[abc]3[cd]ef"))
    }

    @Test
    fun decodeStringD() {
        assertEquals("abccdcdcdxyz", decodeString("abc3[cd]xyz"))
    }

    @Test
    fun decodeStringE() {
        assertEquals(
            "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode",
            decodeString("100[leetcode]")
        )
    }

    @Test
    fun decodeStringF() {
        assertEquals("abcdcdcdabcdcdcdxyxyxyxy", decodeString("2[ab3[cd]]4[xy]"))
    }

    @Test
    fun decodeStringG() {
        assertEquals(
            "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef",
            decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef")
        )
    }

    @Test
    fun decodeStringH() {
        assertEquals(
            "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef",
            decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef")
        )
    }

    @Test
    fun decodeStringI() {
        assertEquals("abcbcbcbcbcbcbcbcbcbcabcbcbcbcbcbcbcbcbcbcabcbcbcbcbcbcbcbcbcbc", decodeString("3[a10[bc]]"))
    }
}