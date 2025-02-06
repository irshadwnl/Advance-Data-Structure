package LinkedList;

public class insertAtEndRecursive {
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
        Node head=Recursive(arr,0,arr.length);
        display(head);

    }
    public static void display(Node head){
        Node curr=head;
        while (curr !=null) {
            System.out.print(curr.data +" ");
            curr=curr.next;
        }
    }
    public static Node Recursive(int arr[],int idx,int n){
        if(idx==n){
            return null;
        }
        Node temp=new Node(arr[idx]);
        temp.next=Recursive(arr, idx+1, n);
        return temp;
    }
}
