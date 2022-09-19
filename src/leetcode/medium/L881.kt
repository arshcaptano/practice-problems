package leetcode.medium

fun main() {
    val output = numRescueBoats(intArrayOf(4,2,2,1), 4)
    print(output)
}

fun numRescueBoats(people: IntArray, limit: Int): Int {
    /*
     2,1 - 3 -> 1
     5, 4, 3, 3, 1 - 5 -> 4
     4, 2, 2, 1 - 4 -> 3
     4, 2, 1, 1 - 4 -> 2
     4, 3, 2, 1 - 4 -> 3
     4, 4, 1, 1 - 4 -> 3
     5, 3, 2, 1 - 5 -> 3
     5, 2, 1, 1, 1, 1 - 5 -> 3
     4, 2 - 5 -> 2
  */
    if (people.size == 1)
        return 1

    var boats = 0
    people.sortDescending()

    var end = people.size - 1
    for (i in people.indices) {
        if (people[i] == limit) {
            boats++
            continue
        }

        var start = i

        while (start <= end) {
            if ((people[i] + people[end]) <= limit) {
                boats++
                end--
                break
            } else if (start == end) {
                boats++
            }

            start++
        }
    }

    return boats
}