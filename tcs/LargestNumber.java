public class LargestNumber {
    public static void main(String[] args) {
        int arr[]={8,10,5,7,9};
        int ans=Integer.MIN_VALUE;
        for(int i:arr){
            ans=Math.max(i, ans);
        }
        System.out.println("LargestNumber: "+ans);
    }
}
