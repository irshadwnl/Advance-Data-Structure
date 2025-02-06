// Ajacency Matrix
package Graph;
import java.util.*;
public class adjaMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex=sc.nextInt();
        int edges=sc.nextInt();
        int mat[][]=new int[vertex][vertex];
        for(int i=0;i<edges;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            mat[u][v]=1;
            mat[v][u]=1;
        }
        for(int i=0;i<mat.length;i++){
            for(int j:mat[i]){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
