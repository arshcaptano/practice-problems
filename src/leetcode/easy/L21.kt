//package leetcode.easy
//
//fun main() {
//    val l1 = ListNode(1)
//    l1.next = ListNode(2)
//    l1.next!!.next = ListNode(4)
//
//    val l2 = ListNode(1)
//    l2.next = ListNode(3)
//    l2.next!!.next = ListNode(4)
//
//    printList(mergeTwoLists(l1, l2))
//}
//
//fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
//    var ptr: ListNode? = l1
//    while (l1?.next != null && l2?.next != null) {
//
//    }
//    return l1
//}
//
//fun printList(l: ListNode?) {
//    while (l != null) {
//        print(l.data.toString() + " ")
//        l = l.next
//    }
//}
//
//class ListNode(var data: Int) {
//    var next: ListNode? = null
//}