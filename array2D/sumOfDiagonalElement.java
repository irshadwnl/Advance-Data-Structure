// package array2D;
// import java.util.*;
// public class sumOfDiagonalElement {
//     public static void main(String[] args) {
//         int arr[][]={
//             {3,4,7,8},
//             {4,8,3,9},
//             {5,4,2,2},
//             {4,6,1,9}
//         };
//         int leftDiagonal=0;
//         int rightDiagonal=0;
//         for (int i = 0; i < arr.length; i++) {
//             int sum=0;
//             for (int j = 0; j < arr[0].length; j++) {
//                 if(i==j){
//                     leftDiagonal+=arr[i][j];
//                 }
//                 if(j==arr.length-i-1){
//                     rightDiagonal+=arr[i][j];
//                 }
//             }
//         }
//         System.out.println(leftDiagonal+" "+ rightDiagonal);
//     }
// }


package array2D;
import java.util.*;
public class sumOfDiagonalElement {
    public static void main(String[] args) {
        int arr[][]={
            {3,4,7,8},
            {4,8,3,9},
            {5,4,2,2},
            {4,6,1,9}
        };
        int leftDiagonal=0;
        int rightDiagonal=0;
        int i=0;
        while(i<arr.length){
            leftDiagonal+=arr[i][i];
            i++;
        }
        i=0;
        int j=arr.length-1;
        while(j>=0){
            rightDiagonal+=arr[i][j];
            i++;
            j--;
        }
        System.out.println(leftDiagonal+" "+ rightDiagonal);
    }
}
