package OOPs;

public class methodOverLoading {
    static class Test {
        void show(){
            System.out.println("5");
        }
        void show(int a){
            System.out.println("7");
        }
        
    };
    public static void main(String[] args) {
        Test t= new Test();
        t.show();
        // t.show(10);
    }
}
