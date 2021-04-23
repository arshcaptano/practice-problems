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

    @Test
    fun reverseWordsF() {
        assertEquals("pariatur? nulla voluptas quo fugiat eum dolorem qui illum vel consequatur, molestiae nihil quam esse velit voluptate ea in qui reprehenderit iure eum vel autem Quis consequatur? commodi ea ex aliquid ut nisi laboriosam, suscipit corporis ullam exercitationem nostrum quis veniam, minima ad enim Ut voluptatem. quaerat aliquam magnam dolore et labore ut incidunt tempora modi eius numquam non quia sed velit, adipisci consectetur, amet, sit dolor quia ipsum dolorem qui est, quisquam porro Neque nesciunt. sequi voluptatem ratione qui eos dolores magni consequuntur quia sed fugit, aut odit aut aspernatur sit voluptas quia voluptatem ipsam enim Nemo explicabo. sunt dicta vitae beatae architecto quasi et veritatis inventore illo ab quae ipsa eaque aperiam, rem totam laudantium, doloremque accusantium voluptatem sit error natus iste omnis unde perspiciatis ut Sed laborum. est id anim mollit deserunt officia qui culpa in sunt proident, non cupidatat occaecat sint Excepteur pariatur. nulla fugiat eu dolore cillum esse velit voluptate in reprehenderit in dolor irure aute Duis consequat. commodo ea ex aliquip ut nisi laboris ullamco exercitation nostrud quis veniam, minim ad enim Ut aliqua. magna dolore et labore ut incididunt tempor eiusmod do sed elit, adipiscing consectetur amet, sit dolor ipsum Lorem", reverseWords("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?"))
    }
}