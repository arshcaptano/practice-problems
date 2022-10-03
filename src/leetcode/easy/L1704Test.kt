package leetcode.easy

import junit.framework.Assert.assertEquals
import leetcode.easy.getMinDistance
import org.junit.Test

class L1704Test {
    @Test
    fun halvesAreAlikeA() {
        assertEquals(true, halvesAreAlike("book"))
    }

    @Test
    fun halvesAreAlikeB() {
        assertEquals(false, halvesAreAlike("textbook"))
    }
}