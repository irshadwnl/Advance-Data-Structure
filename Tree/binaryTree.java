package Tree;
import java.util.*;
public class binaryTree {
    static class Node{
        int val;
        Node left;
        Node right;
        Node (int val){
            this.val=val;
            left=null;
            right=null;
        }
    };
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        int arr[]={1,2,3,4,-1,-1,5,-1,-1,-1,20,-1,-1,};
        idx=-1;
        // int arr[]={1,-1,2,3};
        Node root=buildTree(arr);
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);

    }
    static int idx;
    public static Node buildTree(int arr[]){
        idx++;
        if(idx >= arr.length || arr[idx]==-1){
            return null;
        }
        Node newNode = new Node(arr[idx]);
        newNode.left=buildTree(arr);
        newNode.right=buildTree(arr);
        return newNode;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val +" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val +" ");
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val +" ");
        inOrder(root.right);
        
    }
}
