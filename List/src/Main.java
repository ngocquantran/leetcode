public class Main {

    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        n1.next=n2;
        n2.next=n3;
        printLinkedList(n1);
        printLinkedList(n2);
        printLinkedList(n3);

//        Node newlist=addToHead(n1,0);
//        printLinkedList(newlist);
//
//        Node newLast=addToLast(n1,4);
//        printLinkedList(newLast);

        Node node1=addToIndex(n1,0,0);
        Node node2=addToIndex(n1,4,2);
//        Node node3=addToIndex(n1,5,1);
        printLinkedList(node1);
//        printLinkedList(node2);
//        printLinkedList(node3);


    }
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    public static void printLinkedList(Node head){
        if (head==null){
            System.out.println("List is empty");
        }else {
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.value);
                temp=temp.next;
                if (temp!=null){
                    System.out.print("->");
                }else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node headNode, int value){
        Node newNode=new Node(value);
        if ((headNode!=null)){
            newNode.next=headNode;
        }
        return newNode;
    }

    public static Node addToLast(Node headNode, int value){
        Node newNode=new Node(value);
        if (headNode==null){
            return newNode;
        }else {
            Node lastNode=headNode;
            while (lastNode.next!=null){
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index){
        if (index == 0){
            return addToHead(headNode,value);
        }else {
            //Tìm vị trí cần thêm
            Node newNode=new Node(value);
            Node curNode = headNode;
            int count=0;
            while (curNode != null){
                count++;
                if (count == index){
                    //Thực hiện add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }

        }
        return headNode;
    }
}
