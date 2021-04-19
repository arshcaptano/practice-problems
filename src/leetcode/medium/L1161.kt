package leetcode.medium


fun main() {
    val root = TreeNode(1)
    root.left = TreeNode(7)
    root.right = TreeNode(0)
    root.left?.left = TreeNode(7)
    root.left?.right = TreeNode(-8)
    root.left?.right?.right = TreeNode(10)

    println(maxLevelSum(root))
}

fun maxLevelSum(root: TreeNode?): Int {
    var lvl = 1

    return lvl
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}