package Graph;
import java.util.*;
public class graphRepresentation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int e=7;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        } 
        for(int i=0;i<e;i++){
            int src=sc.nextInt();
            int dest=sc.nextInt();
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
