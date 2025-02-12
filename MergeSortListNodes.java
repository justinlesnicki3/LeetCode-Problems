
public class MergeSortListNodes {

    class ListNode {
        int val; // Value of the node
        ListNode next; // Pointer to the next node

        // Constructor to initialize the node
        public ListNode(int val) {
            this.val = val;
            this.next = null; // Initially, the next node is null
        }
    }

    public MergeSortListNodes mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode blank = new ListNode(0);
        ListNode current = blank;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;

        }

        if (list1 != null)
            current.next = list1;
        if (list2 != null)
            current.next = list2;

        return blank.next;

    }

}
