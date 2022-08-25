public class Main {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(isPalindrome(n1));


    }

    public static boolean isPalindrome(ListNode head) {
        ListNode iNode = head;
        int length = 0;
        while (iNode != null) {
            length++;
            iNode = iNode.next;
        }
        if (length<=1) return true;

        ListNode endOfLeftHalf = head;
        int index = 1;
        while (index < length / 2) {
            endOfLeftHalf = endOfLeftHalf.next;
            index++;
        }

        ListNode startOfRightHalf=null;
        if (length%2==0){
            startOfRightHalf = endOfLeftHalf.next;
        }else {
            startOfRightHalf = endOfLeftHalf.next.next;
            endOfLeftHalf.next.next=null;
        }
        endOfLeftHalf.next = null;


        System.out.println("Sau khi chia list");
        printList(head);
        printList(startOfRightHalf);

        ListNode prev = null;
        ListNode cur = startOfRightHalf;
        while (cur != null) {
            ListNode tem = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tem;
        }

        startOfRightHalf=prev;
        System.out.println("Sau khi đảo list bên phải");
        printList(startOfRightHalf);

        iNode = head;
        while (iNode != null) {
            if (iNode.val == startOfRightHalf.val) {
                iNode = iNode.next;
                startOfRightHalf = startOfRightHalf.next;
            } else {
                return false;
            }
        }
        return true;


    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
        }
        ListNode iNode = head;
        while (iNode != null) {
            System.out.print(iNode + " --> ");
            iNode = iNode.next;
        }
        System.out.println();
    }
}
