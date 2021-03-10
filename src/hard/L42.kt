fun main() {
    val height: IntArray = intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)
    println(trap(height))
}

fun trap(height: IntArray): Int {
    var volume = 0
    var temp = 0
    val n = height.size

    if (n <= 1) return volume

    var start = 0

    for (i: Int in 0 until n) {

        if (i == start) {
            continue
        }

       if(height[i] < height[start]){
           temp += height[start] - height[i]
       }

        if(height[i] >= height[start]){
            volume +=temp
            start = i
        }

    }

    return volume
}
