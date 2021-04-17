package leetcode.easy;

public class L20 {
    public static void main(String[] args) {
        ListNodeL20 l1 = new ListNodeL20(1);
        l1.next = new ListNodeL20(2);
        l1.next.next = new ListNodeL20(4);

        ListNodeL20 l2 = new ListNodeL20(6);
        l2.next = new ListNodeL20(7);
        l2.next.next = new ListNodeL20(8);

        new L20().mergeTwoLists(l1, l2);
    }

    private ListNodeL20 mergeTwoLists(ListNodeL20 l1, ListNodeL20 l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val >l2.val){
            ListNodeL20 temp = l1;
            l1 = l2;
            l2 = temp;
        }

        ListNodeL20 temp;
        ListNodeL20 head = l1;

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

    public static void print(ListNodeL20 node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}

  class ListNodeL20 {
    int val;
    ListNodeL20 next;

    ListNodeL20(int d) {
        val = d;
    }
}