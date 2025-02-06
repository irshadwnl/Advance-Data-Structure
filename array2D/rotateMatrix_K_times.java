package array2D;

public class rotateMatrix_K_times {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int k=234;
        int n=arr.length;
        k=k%4;
        for(int i=0;i<k;i++){
            rotate(arr, n);
        }
         for(int i=0;i<arr.length;i++){
            for(int j:arr[i]){
                System.out.print(j+" ");
            }
            System.out.println();
         }
    }
    public static void rotate(int arr[][],int n){
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
           
        }
        for(int i=0;i<n;i++){
            int start=0;
            int end=arr.length-1;
            while(start<end)
            {
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
         }
    }
}
