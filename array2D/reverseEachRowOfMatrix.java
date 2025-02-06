package array2D;

public class reverseEachRowOfMatrix {

  public static void main(String[] args) {
    int arr[][] = {
      { 3, 4, 7, 8 },
      { 4, 8, 3, 9 },
      { 5, 4, 2, 2 },
      { 4, 6, 1, 9 },
    };
    for (int i = 0; i < arr.length; i++) {
      int j = 0;
      int k = arr[i].length - 1;
      while (j <= k) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][k];
        arr[i][k] = temp;
        j++;
        k--;
      }
    }
    for(int i=0;i<arr.length;i++){
        for(int j:arr[i]){
            System.out.print(j+" ");
        }
        System.out.println();
    }
  }
}
