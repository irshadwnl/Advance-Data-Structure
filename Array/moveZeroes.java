package Array;

import java.util.*;

public class moveZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=new int[arr.length];
        moveZeroes(arr,n,ans);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] moveZeroes(int arr[],int n, int ans[]){
        int zeroes=0;
        for(int i:arr){
            if(i==0){
                zeroes++;
            }
        }
        for(int i=0;i<ans.length;i++){
            if(arr[i]!=0){
                ans[zeroes]=arr[i];
                zeroes++;
            }
        }
        return ans;
    }
}
