package leetcode.medium

fun main() {
    val output = Solution().letterCombinations("234")
    println(output)
}

class Solution {
    private val result: MutableList<String> = mutableListOf()
    private val mapping: HashMap<Char, String> = hashMapOf(
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqrs",
        '8' to "tuv",
        '9' to "wxyz"
    )

    fun letterCombinations(digits: String): List<String> {


        val item = StringBuilder()

        if (digits.isEmpty())
            return result


        return result
    }

    private fun generateElement() {

    }
}
