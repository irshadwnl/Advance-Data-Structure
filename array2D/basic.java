package array2D;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int arr[][]={
        //             {1,2,3},
        //             {4,5,6},
        //             {7,8,9},
        //             {10,11,12}
        //         };
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j:arr[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
