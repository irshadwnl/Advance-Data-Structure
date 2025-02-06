import java.util.*;
public class exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        throw new Error(Arrays.toString(arr));
        // throw new Error(Integer.toString(n));
    }
}
