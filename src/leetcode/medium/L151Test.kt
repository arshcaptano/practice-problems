package leetcode.medium

import junit.framework.Assert.assertEquals
import org.junit.Test

class L151Test {
    @Test
    fun reverseWordsA() {
        assertEquals("blue is sky the", reverseWords("the sky is blue"))
    }

    @Test
    fun reverseWordsB() {
        assertEquals("world hello", reverseWords("  hello world  "))
    }

    @Test
    fun reverseWordsC() {
        assertEquals("example good a", reverseWords("a good   example"))
    }

    @Test
    fun reverseWordsD() {
        assertEquals("Alice Loves Bob", reverseWords("  Bob    Loves  Alice   "))
    }

    @Test
    fun reverseWordsE() {
        assertEquals("bob like even not does Alice", reverseWords("Alice does not even like bob"))
    }
}