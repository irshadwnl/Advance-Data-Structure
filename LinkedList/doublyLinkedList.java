package LinkedList;
public class doublyLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        
    }
    // public static Node insertAtStart(Node head,int val){
    //     if(head==null){
    //         head=new Node(val);
    //     } else{
    //         Node temp=new Node(val);
    //         temp.next=head;
    //         head.prev=temp;
    //         head=temp;
    //     }
    //     return head;
    // }
    public static void display(Node head){
        Node curr=head;
        while (curr !=null) {
            System.out.print(curr.data +" ");
            curr=curr.next;
        }
    }
    public static Node[] insertAtEnd(Node head,Node tail, int val){
        if(head==null){
            head=new Node(val);
            tail=head;
        } else{
            Node temp=new Node(val);
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        return new Node[]{head,tail};
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        Node head=null;
        Node tail=null;
        // for(int i=0;i<arr.length;i++){
        //     head=insertAtStart(head,arr[i]);
        // }
        // display(head);
        for (int i : arr) {
            Node res[]=insertAtEnd(head,tail,i);
            head=res[0];
            tail=res[1];
        }
        display(head);
    }
}
