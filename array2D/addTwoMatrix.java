package array2D;
import java.util.*;
public class addTwoMatrix {
    public static void main(String[] args) {
        int arr1[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
            };
        int arr2[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
            };

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j:arr1[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
