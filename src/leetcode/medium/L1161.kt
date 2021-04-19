package leetcode.medium


fun main() {
    val root = TreeNode(1)
    root.left = TreeNode(7)
    root.right = TreeNode(0)
    root.left?.left = TreeNode(7)
    root.left?.right = TreeNode(-8)
    /*
                    1
                   / \
                  7   0
                 / \
                7  -8
     */

    println(maxLevelSum(root))
}

val map = HashMap<Int, Int>()
var lvl = 1

fun maxLevelSum(root: TreeNode?): Int {
    if (lvl == 1) map[lvl] = root?.`val` ?: 0
    if (root?.left == null && root?.right == null) return lvl--
    if (root.left == null && root.right != null) {
        map[lvl] = root.right?.`val`!!
        return lvl
    }
    if (root.left != null && root.right == null) {
        map[lvl] = root.left?.`val`!!
        return lvl
    }

    lvl++
    val sum: Int = root.left?.`val`!! + root.right?.`val`!!
    if (map.containsKey(lvl))
        map[lvl] = map[lvl]!! + sum
    else
        map[lvl] = sum

    maxLevelSum(root.left)
    maxLevelSum(root.right)

    return maxLevel(map)
}

fun maxLevel(map: HashMap<Int, Int>): Int {
    var key = 0

    for (curr in map.entries) {
        if (curr.value > key)
            key = curr.key
    }

    return key
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}