package OOPs;
public class methodOverriding {
    static class Test{
        void show(){
            System.out.println("Test");
        }
    }
    static class Test2 extends Test{
        void show(){
            // super.show(); //parent class k method ko call krne k liye
            System.out.println("Test2");
        }
    }
    public static void main(String[] args) {
        Test t=new Test2();
        t.show();
    }
}
