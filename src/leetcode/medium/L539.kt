package leetcode.medium

fun main() {
    val output = findMinDifference(listOf("01:00", "23:59"))
    print(output)

    /*
    00:00 - 23:59, 00: 00
    00:00 - 00:00
     */
}

//1439
/*
["01:00", "23:59"] -> 61
["01:01", "02:01"] -> 60
["01:01", "02:02"] -> 61
["02:00", "23:59", "00:00] -> 1
["23:00", "00:00"] -> 60
["00:00","23:00","00:00"] -> 0
["02:00","23:00"] -> 180
["02:00","23:59","22:00"] -> 119
["13:00","23:59","22:00", "23:12"] -> 47
["11:00", "00:00"] -> 660
["11:00", "00:00", "13:00", "03:00", "06:00"] -> 120
 */
var minDiff = Int.MAX_VALUE

fun findMinDifference(timePoints: List<String>): Int {
    if (timePoints.size == 1)
        return Math.min(minDiff, processTime(timePoints[0]))

    val mid = Math.floor((timePoints.size / 2).toDouble()).toInt()

    val first = findMinDifference(timePoints.slice(0 until mid))
    val last = findMinDifference(timePoints.slice(mid until timePoints.size))

    return if (timePoints.size == 2)
        Math.abs(first - last)
    else
        Math.min(first, last)
}

fun processTime(time: String): Int {
    var diff = 0
    val hours = getHours(time)
    val minutes = getMinutes(time)

    if (hours >= "13" || hours <= "00") {
        val tempMinutes = if (hours == "00") 0 else (24 - hours.toInt()) * 60
        diff = tempMinutes - minutes.toInt()
    } else if (hours >= "1" || hours <= "12") {
        val tempMinutes = hours.toInt() * 60
        diff = minutes.toInt() - tempMinutes
    }

    return diff
}

fun getHours(time: String): String {
    return time.substringBefore(':')
}

fun getMinutes(time: String): String {
    return time.substringAfter(':')
}