package OOPs;
import java.util.*;
public  class exceptionHandling {
    public static void main(String[] args) {
        int num=8;
        int div=2;
        int res=0;
        int arr[]={1,2,3};
        try{
            res=num/div;
            System.out.println(arr[3]);
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index ou of bound!!");
        }
        System.out.println(res);
        System.out.println("all Okay");
    }
}
