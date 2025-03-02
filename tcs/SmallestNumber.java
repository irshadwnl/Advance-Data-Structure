
//  Given an array, we have to find the smallest element in the array.

public class SmallestNumber {
    public static void main(String[] args) {
        // int arr[]={2,5,1,3,0};
        int arr[]={8,10,5,7,9};
        int ans=Integer.MAX_VALUE;
        for(int i:arr){
            ans=Math.min(i, ans);
        }
        System.out.println("SmallestNumber: "+ans);
    }
}
