public class Main {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aNode = headA;
        ListNode bNode = headB;
        int countA = 0;
        int countB = 0;
        while (aNode != null) {
            countA++;
            aNode = aNode.next;
        }
        while (bNode != null) {
            countB++;
            bNode = bNode.next;
        }
        aNode = headA;
        bNode = headB;

        while (countA < countB) {
            bNode = bNode.next;
            countA++;
        }
        while (countB < countA) {
            aNode = aNode.next;
            countB++;
        }
        while (aNode != null && bNode != null) {
            if (aNode == bNode) {
                return aNode;
            } else {
                aNode = aNode.next;
                bNode = bNode.next;
            }
        }
        return null;


    }
}
