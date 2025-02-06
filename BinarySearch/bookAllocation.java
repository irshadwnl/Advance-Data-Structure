// Leetcode 1011:
package BinarySearch;
import java.util.*;
public class bookAllocation {

    public static void main(String[] args) {
        int arr[]={12,34,67,90};
        int m=2;
        if(m>arr.length){
            System.out.println("-1");
        }
        int start=0;
        int end=0;
        int ans=0;
        for(int i:arr){
            start=Math.max(start, i);
            end+=i;
        }
        while (start <=end) {
            int mid = start +(end-start)/2;
            int cnt=1;
            int page=0;
            for(int i:arr){
                page+=i;
                if(page > mid){
                    cnt++;
                    page=i;
                }
            }
            if(cnt <=m){
                ans=mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        System.out.println(ans);
    }
}