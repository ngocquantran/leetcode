public class Main {
    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(2);
        ListNode n4=new ListNode(3);
        ListNode n5=new ListNode(3);
        n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
        deleteDuplicates(n1);


    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode prev=head;
        ListNode cur=head.next;
        int count=0;
        System.out.println("prev= "+prev);
        System.out.println("cur= "+cur);
        while (cur!=null){
            count++;
            System.out.println("Lần "+count);
            if (cur.val==prev.val){
                prev.next=cur.next;
                cur=prev.next;
            }else {
                cur=cur.next;
                prev=prev.next;
            }
            System.out.println("prev= "+prev);
            System.out.println("cur= "+cur);
            printAll(head);
        }
        return head;

    }

    public static void printAll(ListNode head){
        if (head==null) System.out.println("List is empty");
        ListNode iNode=head;
        while (iNode!=null){
            System.out.print(iNode+" --> ");
            iNode=iNode.next;
        }
        System.out.println();
    }
}
