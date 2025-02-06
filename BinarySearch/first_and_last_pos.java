// First occurence of a number:-
// package BinarySearch;
// import java.util.*;
// public class first_and_last_pos {
//     public static void main(String[] args) {
//         int arr[]={2,7,7,8,8,10};
//         int target=8;
//         int st=0;
//         int end=arr.length-1;
//         int firstPos=-1;
//         while(st<=end){
//             int mid=st+(end-st)/2;
//             if(arr[mid]==target){
//                 firstPos=mid;
//                 end=mid-1;
//             }else if(arr[mid] > target){
//                 end=mid-1;
//             } else{
//                 st=mid+1;
//             }
//         }
//         System.out.print(firstPos);
//     }
// }

// last occurence of given target:-
package BinarySearch;
import java.util.*;
public class first_and_last_pos {
    public static void main(String[] args) {
        int arr[]={2,7,7,8,8,10};
        int target=8;
        int st=0;
        int end=arr.length-1;
        int lastPos=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                lastPos=mid;
                st=mid+1;
            }else if(arr[mid] > target){
                end=mid-1;
            } else{
                st=mid+1;
            }
        }
        System.out.print(lastPos);
    }
}
