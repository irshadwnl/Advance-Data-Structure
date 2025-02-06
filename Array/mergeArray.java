package Array;

import java.util.*;

public class mergeArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]={8,9,10,11,12,13};
        int i=0;
        int j=0;
        int ans[]=new int[arr1.length+arr2.length];
        int idx=0;
        while(i<arr1.length && j<arr2.length){
            ans[idx++]=arr1[i];
            ans[idx++]=arr2[j];
            i++;
            j++;
        }
        while(i<arr1.length){
            ans[idx++]=arr1[i];
            i++;
        }
        while(j<arr2.length){
            ans[idx++]=arr2[j];
            j++;
        }
        System.out.print(Arrays.toString(ans));
    }
}
