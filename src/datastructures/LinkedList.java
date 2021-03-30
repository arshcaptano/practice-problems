package datastructures;

class LinkedList {
    /*
     LinkedList manipulation
     */
    public static void main(String[] args) {
        // 1 -> 2 -> 3
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(3);

        printNode(new LinkedList().deleteDuplicates(listNode));
    }

    private ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode ptr = head;
        while (ptr.next != null) {
            if (ptr.val == ptr.next.val)
                ptr.next = ptr.next.next;
            else
                ptr = ptr.next;
        }
        return head;
    }

    public static void printNode(ListNode v) {
        while (v != null) {
            System.out.println(v.val);
            v = v.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int d) {
        val = d;
    }
}