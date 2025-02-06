package BinarySearch;

public class searchInsertPos {
    public static void main(String[] args) {
        int arr[]={1,4,6,8,10,16,17};
        int target=5;
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }else if(arr[mid] > target){
                ans=mid;
                end=mid-1;
            } else{
                st=mid+1;
            }
        }
        System.out.print(ans);
    }
}
