package leetcode.easy


fun main() {
    val strings = listOf("hello", "leetcode", "aA", "cup")

    for (string in strings)
        println(reverseVowels(string))
}

fun reverseVowels(s: String): String {
    val checkVowels: HashSet<Char> = hashSetOf('a', 'e', 'i', 'o', 'u')


    val vowels: MutableList<Char> = mutableListOf()
    val sArray = s.toCharArray()
    for (c in sArray)
        if (checkVowels.contains(c.lower()))
            vowels.add(c)

    val output = StringBuilder()

    var vowelSize = vowels.size - 1
    for (c in sArray)
        if (checkVowels.contains(c.lower())) {
            output.append(vowels[vowelSize])
            vowelSize--
        }else{
            output.append(c)
        }

    return output.toString()
}

fun Char.lower(): Char = Character.toLowerCase(this)