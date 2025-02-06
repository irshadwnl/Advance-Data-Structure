package OOPs;

public class varArgs {
    static class Test {
    void method(int... a) {
        System.out.println("Varargs method");
    }
    
    void method(int a) {
        System.out.println("Normal method");
    }
    
    
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.method(10);  // ERROR: Ambiguous method call!
    }
}


// Ambuigity error 
// package OOPs;
// public class varArgs {
// static class Test {
//     void method(int... a) {
//         System.out.println("Varargs method");
//     }

//     void method(Integer... a) {
//         System.out.println("Wrapper Varargs method");
//     }

//     public static void main(String[] args) {
//         Test obj = new Test();
//         obj.method(10);  // ERROR: Ambiguous method call!
//         }
//     }
// }
