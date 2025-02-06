package OOPs;

public class superKeyword {
    static class A {
        int a=10; 
    }
    static class B extends A {
        int a=20;
        public void show(int a){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(super.a);
        }
        
    }
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show(30);
    }
}
