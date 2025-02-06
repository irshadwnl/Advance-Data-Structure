package array2D;
import java.util.*;
public class searchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        System.out.println(isItFound(arr,k));
    }
    public static boolean isItFound(int arr[][],int k){
        for(int i=0;i<arr.length;i++){
            for(int j:arr[i]){
                if(j==k) return true;
            }
        }
        return false;
    }
}
