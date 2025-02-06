package NumberProgram;

public class Palindrome {
    public static void main(String[] args) {
        int n=245642;
        int og=n;
        int num=0;
        while(n!=0){
            int rem=n%10;
            num=num*10+rem;
            n=n/10;
        }
        System.out.print(num==og?true:false);
    }
}
