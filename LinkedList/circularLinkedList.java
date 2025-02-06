package LinkedList;
public class circularLinkedList {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    };
    public static void main(String[] args) {
        int arr[]={3,2,6,4};
        Node head=null;
        for(int i=0;i<arr.length;i++){
            if(head==null){
                head=new Node(arr[i]);
                head.next=head;
            } else{
                Node newNode=new Node(arr[i]);
                newNode.next=head.next;
                head.next=newNode;
                head=newNode;
            }
        }
        if (head != null) {
            Node temp = head.next; 
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head.next); 
        }
    }
}
