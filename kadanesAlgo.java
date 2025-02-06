// Brute Force:-

// public class kadanesAlgo {
//     public static void main(String[] args) {
//         int arr[]={4,3,7,2};
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 for(int k=i;k<=j;k++){
//                     System.out.print(arr[k]+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }

// Divide array in 2 subarray with equal sum:-
public class kadanesAlgo {
    public static void main(String[] args) {
        int arr[]={3,4,-2,5,8,20,-10,8};
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int prefix=0;
        for(int i=0;i<arr.length-1;i++){
            prefix+=arr[i];
            int temp=sum-prefix;
            if(prefix==temp){
                System.out.println("yes");
                break;
            }
        }
        // System.out.println("no");
    }
}
