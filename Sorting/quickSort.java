package Sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int arr[]={15,9,7,13,12,16,4,18,11};
        int j=arr.length-1;
        sort(arr, 0, j);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
}
