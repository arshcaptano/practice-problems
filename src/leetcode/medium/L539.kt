package leetcode.medium

fun main() {
    val output = findMinDifference(listOf("01:00", "23:59"))
    print(output)
}


fun findMinDifference(timePoints: List<String>): Int {
    if (timePoints.size == 1) return 0

    val sortedPoints = sortTimePoints(timePoints)

    var diff = sortedPoints[sortedPoints.size - 1] - sortedPoints[0]

    var track = sortedPoints.size - 2
    var end = sortedPoints.size - 1
    while (track >= 0) {
        val tempDiff = sortedPoints[end] - sortedPoints[track]
        diff = Math.min(tempDiff, diff)

        track--
        end--
    }

    return Math.ceil(diff).toInt() * 60
}

fun sortTimePoints(timePoints: List<String>): List<Double> {
    val sortedPoints = mutableListOf<Double>()

    for (element in timePoints) {
        sortedPoints.add(element.replace(':', '.').toDouble())
    }
    return sortedPoints.sorted()
}
