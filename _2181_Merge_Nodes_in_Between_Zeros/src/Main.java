public class Main {
    public static void main(String[] args) {


    }

    public ListNode mergeNodes(ListNode head) {
        ListNode result = null;
        ListNode iNode = head.next;
        int sum = 0;
        while (iNode != null) {
            sum += iNode.val;
            if (iNode.val == 0) {
                ListNode newNode = new ListNode(sum);
                head.next = newNode;
                if (result == null) {
                    result = head.next;
                }
                head = head.next;
                sum = 0;
            }
            iNode = iNode.next;
        }
        return result;

    }
}
