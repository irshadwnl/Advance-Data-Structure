// Leetcode 852:
package BinarySearch;
import java.util.*;
public class peakIndexInMountain {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,8,5};
        int ans = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = high + (low - high) / 2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                ans=mid;
                break;
            }else if(arr[mid] > arr[mid-1] ){
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}