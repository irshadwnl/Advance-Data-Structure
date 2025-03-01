package BitManipulation;

public class integerTBinary {
    public static void main(String[] args) {
        int n=23;
        StringBuilder sb=new StringBuilder();
        while(n !=0){
            int rem=n%2;
            sb.append(rem);
            n=n/2;
        }
        System.out.println(sb.reverse().toString());
    }
}

// Method 2:

// package BitManipulation;

// public class integerTBinary {
//     public static void main(String[] args) {
//         int n=23;
//         String str="";
//         while(n !=0){
//             int rem=n%2;
//             str=rem+str;
//             n=n/2;
//         }
//         System.out.println(str);
//     }
// }
