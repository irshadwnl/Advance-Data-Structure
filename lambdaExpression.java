import java.util.*;
public class lambdaExpression {
    public static void main(String[] args) {
        sum sum=(a,b)->{
        return a+b;
       };
       System.out.println(sum.sum(5, 10));
    }
}
