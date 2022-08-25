public class Main {
    public static void main(String[] args) {


    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode iNode = head;
        int length = 0;
        while (iNode != null) {
            length++;
            iNode = iNode.next;
        }
        if (length == 1) {
            return head;
        }

        int index = 1;
        ListNode prev1 = null;
        ListNode node1 = head;
        while (index < k) {
            prev1 = node1;
            node1 = node1.next;
            index++;
        }
        prev1.next = null;

        ListNode prev2 = prev1;
        ListNode node2 = node1;
        while (index <= length - k) {
            prev2 = node2;
            node2 = node2.next;
            index++;
        }
        ListNode rightPart = node2.next;
        node2.next = null;

        // đổi đầu và cuối mảng giữa k
        node2.next = node1.next;
        node1.next = null;
        prev2.next = node1;

        if (prev1 == null) {
            return node2;
        }
        prev1.next = node2;
        node1.next = rightPart;
        return head;


    }
}
