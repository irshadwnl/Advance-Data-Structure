package array2D;
import java.util.*;
public class printRowWithMaxSum {
    public static void main(String[] args) {
        int arr[][]={
            {3,4,7,8},
            {4,8,3,9},
            {5,4,2,2},
            {4,6,1,9},
            {8,1,2,3}
        };
        int ans=0,idx=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[0].length; j++) {
                sum+=arr[i][j];
            }
            // ans=Math.max(ans, sum);
            if(ans < sum){
                ans=sum;
                idx=i;
            }
            
        }
        System.out.println(ans+ " " + idx );
    }
}
