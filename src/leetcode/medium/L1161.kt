package leetcode.medium


var map = HashMap<Int, Int>()
var lvl = 1

fun main() {
    val root = TreeNode(1)
    root.left = TreeNode(7)
    root.right = TreeNode(0)
    root.right?.left = TreeNode(7)
    root.right?.right = TreeNode(-8)
    /*
                    1
                   / \
                  7   0
                 / \
                7  -8
              -----------------
                    1
                   / \
                  7   0
                     / \
                    7  -8
              -----------------
                    -100
                     / \
                 -200   -300
                  / \     /
               -20  -5  -10
     */

    map = HashMap<Int, Int>()
    lvl = 1
    println(maxLevelSum(root))
}

fun maxLevelSum(root: TreeNode?): Int {
    if (root?.`val` == null) return lvl

    val sum: Int = root.`val`
    if (map.containsKey(lvl))
        map[lvl] = map[lvl]!! + sum
    else
        map[lvl] = sum

    if (root.left == null && root.right == null) return lvl

    lvl++
    if (root.left != null && root.right == null) {
        map[lvl--] = root.left?.`val`!!
        return lvl
    }
    if (root.left == null && root.right != null) {
        map[lvl--] = root.right?.`val`!!
        return lvl
    }

    maxLevelSum(root.left)
    maxLevelSum(root.right)
    lvl--

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