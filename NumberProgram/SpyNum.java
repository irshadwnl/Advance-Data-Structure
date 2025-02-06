package NumberProgram;

public class SpyNum {
    public static void main(String[] args) {
        int n=123;
        int sum=0;
        int prod=1;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n=n/10;
        }
        System.out.println(sum==prod?true:false);
    }
}
