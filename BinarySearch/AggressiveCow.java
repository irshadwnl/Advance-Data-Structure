package BinarySearch;

import java.util.Arrays;

/**
 * AggressiveCow
 */
public class AggressiveCow {

    public static void main(String[] args) {
        int arr[]= {10,1,2,7,5};
        int k=3;
        Arrays.sort(arr);
        int ans=0;
        int start=1;
        int end=arr[arr.length-1]-arr[0];
        while(start <= end){
            int mid=start+(end-start)/2;
            boolean flag = isItPossibble(arr,mid,k);
            if(flag==true){
                ans=mid;
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        System.out.println(ans);

    }
    public static boolean isItPossibble(int arr[],int mid,int k){
        int tie=arr[0];
        k=k-1;
        for(int i=1;i<arr.length;i++){
            if((tie+mid) <= arr[i]){
                k--;
                tie=arr[i];
            }
        }
        if(k<=0){
            return true;
        }
        return false;
    }
}