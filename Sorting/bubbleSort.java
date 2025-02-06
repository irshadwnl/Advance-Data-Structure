package Sorting;
import java.util.*;
public class bubbleSort {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sort[]=new int[n];
        for(int i=0;i<n;i++){
            sort[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for( int j = i+1; j<n; j++ ){
                if( sort[i] > sort[j] ){
                    int swap = sort[i];
                    sort[i] = sort[j];
                    sort[j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(sort));
     }
}
