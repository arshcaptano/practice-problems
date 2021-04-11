package leetcode.easy;

public class L20 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(7);
        l2.next.next = new ListNode(8);

//        System.out.println("\nL1");
//        print(l1);
//        System.out.println("\nL2");
//        print(l2);
//        System.out.println("\nL3");
        new L20().mergeTwoLists(l1, l2);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val >l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }

        ListNode temp;
        ListNode head = l1;

        while(l1.next != null){
            // 1 - 2 - 4 l1
            // 1 - 3 -4 l2
            // 2 - 4 temp
            // 1 - (1 - 3 - 4) l1.next
            // 1 - 3 - 4 l1
            // 2 - 4 l2

            if(l1.next.val >l2.val){

                temp = l1.next;
                l1.next = l2;
                l1 = l2;
                l2  = temp;
            }else{
                l1= l1.next;
            }

            System.out.println("\nL1-LOOP");
            print(l1);
            System.out.println("\nL2-LOOP");
            print(l2);
            System.out.println("\nHEAD-LOOP");
            print(head);
        }
        l1.next = l2;

        System.out.println("\nHEAD-LOOP");
        print(head);
        return head;
    }

    public static void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
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