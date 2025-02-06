package LinkedList;
public class insertAtEnd {
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
        Node tail=head;
        for(int i=0;i<arr.length;i++){
            if(head==null){
                head=new Node(arr[i]);
                tail=head;
            } else{
                // Node temp=new Node(arr[i]);
                // tail.next=temp;
                // another way:-
                tail.next=new Node(arr[i]);
                tail=tail.next;
            }
        }
        display(head);

    }
    public static void display(Node head){
        Node curr=head;
        while (curr !=null) {
            System.out.print(curr.data +" ");
            curr=curr.next;
        }
    }
}
