package leetcode.medium

import junit.framework.Assert.assertEquals
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

        map = HashMap<Int, Int>()
        lvl = 1

        assertEquals(2, maxLevelSum(root))
    }

    @Test
    fun maxLevelSumB() {
        // [1,7,0,7,-8,null,null,null,null,null,10]
        val root = TreeNode(1)
        root.left = TreeNode(7)
        root.right = TreeNode(0)
        root.left?.left = TreeNode(7)
        root.left?.right = TreeNode(-8)
        root.left?.right?.right = TreeNode(10)

        map = HashMap<Int, Int>()
        lvl = 1

        assertEquals(4, maxLevelSum(root))
    }

    @Test
    fun maxLevelSumC() {
        // [1,7,0,7,-8,null,0,null,null,null,10,null,null]
        val root = TreeNode(1)
        root.left = TreeNode(7)
        root.right = TreeNode(0)
        root.left?.left = TreeNode(7)
        root.left?.right = TreeNode(-8)
        root.right?.right = TreeNode(0)
        root.left?.right?.right = TreeNode(10)

        map = HashMap<Int, Int>()
        lvl = 1

        assertEquals(4, maxLevelSum(root))
    }

    @Test
    fun maxLevelSumD() {
        // [1,7,null,null,0,7,-8]
        val root = TreeNode(1)
        root.left = TreeNode(7)
        root.right = TreeNode(0)
        root.right?.left = TreeNode(7)
        root.right?.right = TreeNode(-8)

        map = HashMap<Int, Int>()
        lvl = 1

        assertEquals(2, maxLevelSum(root))
    }

    @Test
    fun maxLevelSumE() {
        // [989,null,10250,98693,-89388,null,null,null,-32127]
        val root = TreeNode(989)
        root.right = TreeNode(10250)
        root.right?.left = TreeNode(98693)
        root.right?.right = TreeNode(-89388)
        root.right?.right?.right = TreeNode(-32127)

        map = HashMap<Int, Int>()
        lvl = 1

        assertEquals(2, maxLevelSum(root))
    }

    @Test
    fun maxLevelSumF() {
        // [-100,-200,-300,-20,-5,-10,null]
        val root = TreeNode(-100)
        root.left = TreeNode(-200)
        root.right = TreeNode(-300)
        root.left?.left = TreeNode(-20)
        root.left?.right = TreeNode(-5)
        root.right?.left = TreeNode(-10)

        map = HashMap<Int, Int>()
        lvl = 1

        assertEquals(3, maxLevelSum(root))
    }
}