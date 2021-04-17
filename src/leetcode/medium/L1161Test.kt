package leetcode.medium

import junit.framework.Assert.assertEquals
import leetcode.medium.decodeString
import org.junit.Test

class L1161Test {
    @Test
    fun maxLevelSumA() {
        // [1,7,0,7,-8,null,null]
        val root = TreeNode(1)
        root.left = TreeNode(7)
        root.right = TreeNode(0)
        root.left?.left = TreeNode(7)
        root.left?.right = TreeNode(-8)

        assertEquals(2, maxLevelSum(root))
    }

    @Test
    fun maxLevelSumB() {
        // [989,null,10250,98693,-89388,null,null,null,-32127]
        val root = TreeNode(989)
        root.right = TreeNode(10250)
        root.right?.left = TreeNode(98693)
        root.right?.right = TreeNode(-89388)
        root.right?.right?.right = TreeNode(-32127)

        assertEquals(2, maxLevelSum(root))
    }
}