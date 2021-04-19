package leetcode.medium


var map = HashMap<Int, Int>()
var lvl = 1

fun main() {
    val root = TreeNode(1)
    root.left = TreeNode(6)
    root.right = TreeNode(0)
    root.left?.left = TreeNode(7)
    root.left?.right = TreeNode(-8)
    root.right?.right = TreeNode(0)
    root.left?.right?.right = TreeNode(10)
    /*
                    1
                   / \
                  6   0
                 / \
                7  -8
              -----------------
                    1
                   / \
                  6   0
                     / \
                    7  -8
              -----------------
                    -100
                     / \
                 -200   -300
                  / \     /
               -20  -5  -10
              -----------------
                    1
                   / \
                  6   0
                 / \   \
                7  -8   0
                     \
                      10
              -----------------
                    1
                   / \
                  16   0
                 / \   \
                7  -8   0
                     \
                      10
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
    maxLevelSum(root.left)
    maxLevelSum(root.right)
    lvl--

    return maxLevel()
}

fun maxLevel(): Int {
    var key = 1
    val `val` = map.entries.stream().findFirst().get().value

    for (m in map.entries) {
        if (m.value > `val`)
            key = m.key
    }

    return key
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}