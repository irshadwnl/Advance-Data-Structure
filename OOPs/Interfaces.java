package OOPs;
public class Interfaces{
    interface i1{
        default void show(){
            System.out.println("hiii");
        }
    }
    interface i2{
        default void show(){
            System.out.println("hello");
        }
    }
    static class Test implements i1,i2{
        public void show(){
            // i1.super.show();
            System.out.println("Overridden method in test");
        }
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
    }
}