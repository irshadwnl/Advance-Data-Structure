package NumberProgram;
//  a num is divisible by the sum of its digit; 
public class HarshadNumber {
    public static void main(String[] args) {
        int n=156;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(n%sum==0?"Yes":"No");
    }
}
