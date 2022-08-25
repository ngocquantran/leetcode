public class Main {
    public static void main(String[] args) {
        ListNode n1=new ListNode(5);
        ListNode n2=new ListNode(4);
        ListNode n3=new ListNode(2);
        ListNode n4=new ListNode(1);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        System.out.println(pairSum(n1));

    }
    public static int pairSum(ListNode head) {
        ListNode iNode=head;
        //Tính chiều dài linked list
        int length=0;
        while (iNode!=null){
            length++;
            iNode=iNode.next;
        }

        // Chia đôi linked list
        iNode=head;
        int count=0;
        while (count<length/2-1){
            iNode=iNode.next;
            count++;
        }
        ListNode startRight=iNode.next;
        iNode.next=null;
        printList(head);
        printList(startRight);

        // Đảo ngược nửa bên phải
        ListNode prev=null;
        ListNode cur=startRight;
        while (cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        startRight=prev;
        printList(head);
        printList(startRight);

        // Tính tổng rửa trước và nửa sau sau khi đảo
        int max=0;
        iNode=head;
        while (iNode!=null){
            max=Math.max(iNode.val+ startRight.val,max);
            iNode=iNode.next;
            startRight=startRight.next;
        }
        return max;

    }

    public static void printList(ListNode head){
        if (head == null) {
            System.out.println("List is empty");
        }
        ListNode iNode=head;
        while (iNode!=null){
            System.out.print(iNode+" --> ");
            iNode=iNode.next;
        }
        System.out.println();
    }
}
