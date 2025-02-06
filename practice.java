// Factorial:-
// import java.util.*;
// public class practice {
//     public static void main(String[] args) {
//         System.out.println(fact(5));
//     }
//     public static int fact(int n){
//         if(n==1 ){
//             return n;
//         }
//         return n*fact(n-1);
//     }
// }

// Fibonacci:-
// import java.util.*;
// public class practice {
//     public static void main(String[] args) {
//         System.out.println(fibo(6));
//     }
//     public static int fibo(int n){
//         if(n == 0 || n == 1 ){
//             return n;
//         } 
//         return fibo(n-1) + fibo(n-2);
//     }
// }

// Subsequence:-
import java.util.*;
public class practice {
    static ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        String str="abc";
        subsequence(str,0,new StringBuilder(""));
        System.out.println(ans);
    }
    public static void subsequence(String str,int idx,StringBuilder sb){
        if(idx == str.length()){
            ans.add(sb.toString());
            return;
        }
        subsequence(str, idx+1, sb);
        sb.append(str.charAt(idx));
        subsequence(str, idx+1, sb);
        sb.deleteCharAt(sb.length()-1);
    }
}