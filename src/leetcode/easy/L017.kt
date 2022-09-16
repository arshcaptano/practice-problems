package leetcode.easy

fun main() {
    val output = L017().letterCombinations("234")
    println(output)
}

class L017 {
    private val result: MutableList<String> = mutableListOf()
    private val map: HashMap<Char, String> = hashMapOf(
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

        for (digit in digits)
            generateElement(digit, item)

        result.add(item.toString())

        item.clear()

        return result
    }

    private fun generateElement(digit: Char, element: StringBuilder): StringBuilder {
        val letters = map[digit] ?: ""

        if (letters.isEmpty())
            return element

        for (letter in letters)
            element.append(letter)

        return element
    }
}

/*
    "a",    "b",    "c"
    "ad",   "ae",   "af"
    "adp",  "adq",  "adr"
    "adgp", "adgq", "adgr"
 */
