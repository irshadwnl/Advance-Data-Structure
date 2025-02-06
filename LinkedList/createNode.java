// Insert at Begining:-
package LinkedList;
public class createNode {
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
            } else{
                Node temp=new Node(arr[i]);
                temp.next=head;
                head=temp;
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
