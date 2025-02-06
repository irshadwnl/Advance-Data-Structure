package DP;
import java.util.Scanner;
public class uniquePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(sol(0,m-1,0,n-1,new int[m][n]));
    }
    public static int sol(int sr,int er,int sc,int ec,int dp[][]){
        if(sr == er && sc == ec){
            return 1;
        }
        if(sr >er || sc > ec){
            return 0;
        }
        if(dp[sr][sc]!=0){
            return dp[sr][sc];
        }
        int down=sol(sr+1, er, sc, ec,dp);
        int right=sol(sr, er, sc+1, ec,dp);
        return dp[sr][sc]=down+right;
    }
}
