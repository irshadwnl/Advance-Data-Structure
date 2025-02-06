// Rotate Matrix by 90 Degree Clockwise:-
package array2D;

public class rotateMatrix {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n=arr.length;
        int ans[][]=new int[n][n];
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            ans[j][n-1-i]=arr[i][j];
           }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
             System.out.print(ans[i][j]+" ");
            }
            System.out.println();
         }
    }
}
