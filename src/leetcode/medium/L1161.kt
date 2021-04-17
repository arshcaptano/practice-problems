package leetcode.medium

fun main() {
    val root = TreeNode(1)
    root.left = TreeNode(7)
    root.right = TreeNode(0)
    root.left?.left = TreeNode(7)
    root.left?.right = TreeNode(-8)

//    val root = TreeNode(989)
//    root.right = TreeNode(10250)
//    root.right?.left = TreeNode(98693)
//    root.right?.right = TreeNode(-89388)
//    root.right?.right?.right = TreeNode(-32127)

    println(maxLevelSum(root))
}

fun maxLevelSum(root: TreeNode?): Int {
    // TODO: Incomplete
    var max = root?.`val` ?: 0
    var lvl = 1
    var left = root?.left
    var right = root?.right

    while (left != null || right != null) {
        var sum = 0

        if (left?.`val` != null) {
            sum += maxLevelSum(left)

            left = left.left
        }

        if (right?.`val` != null) {
            sum += maxLevelSum(right)

            right = right.right
        }

        if (sum > max) {
            max = sum
            lvl++
        }
    }

    return lvl
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}