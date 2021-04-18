package leetcode.medium


fun main() {
//    val root = TreeNode(1)
//    root.left = TreeNode(7)
//    root.right = TreeNode(0)
//    root.left?.left = TreeNode(7)
//    root.left?.right = TreeNode(-8)

//    val root = TreeNode(989)
//    root.right = TreeNode(10250)
//    root.right?.left = TreeNode(98693)
//    root.right?.right = TreeNode(-89388)
//    root.right?.right?.right = TreeNode(-32127)

//    val root = TreeNode(-100)
//    root.left = TreeNode(-200)
//    root.right = TreeNode(-300)
//    root.left?.left = TreeNode(-20)
//    root.left?.right = TreeNode(-5)
//    root.right?.left = TreeNode(-10)

    val root = TreeNode(1)
    root.left = TreeNode(7)
    root.right = TreeNode(0)
    root.left?.left = TreeNode(7)
    root.left?.right = TreeNode(-8)
    root.left?.right?.right = TreeNode(10)

    println(maxLevelSum(root))
}

fun maxLevelSum(root: TreeNode?): Int {
    var max = 0
    var temp = root
    var lvl = 1

    while (temp?.left != null || temp?.right != null) {
        var sum = 0

        if (root?.left?.`val` != null)
            sum += levelMax(temp.left)

        if (root?.right?.`val` != null)
            sum += levelMax(temp.right)

        if (sum > max || lvl == 1) {
            max = sum
            lvl++
        }

        temp = temp.left
    }

    while (temp?.left != null || temp?.right != null) {
        var sum = 0

        if (root?.left?.`val` != null)
            sum += levelMax(temp.left)

        if (root?.right?.`val` != null)
            sum += levelMax(temp.right)

        if (sum > max || lvl == 1) {
            max = sum
            lvl++
        }

        temp = temp.right
    }

    return lvl
}

fun levelMax(root: TreeNode?): Int {
    var max = 0

    if (root?.left?.`val` != null)
        max += root.left!!.`val`

    if (root?.right?.`val` != null)
        max += root.right!!.`val`

    return max
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}