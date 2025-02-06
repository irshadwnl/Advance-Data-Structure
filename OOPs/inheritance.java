// Inheritance:-
// package OOPs;

// public class inheritance {
//     static class Animal {
    
//         void eat(){
//             System.out.println("eating");
//         }
//     }
//     static class dog extends Animal{

//     }
//     public static void main(String[] args) {
//         dog bullDog=new dog();
//         bullDog.eat();
        
//     }
// }


// Single Inheritance:-

// package OOPs;

// public class inheritance {
//     static class A {
    
//         void showA(){
//             System.out.println("It is A class Method");
//         }
//     }
//     static class B extends A{
//         void showB(){
//             System.out.println("It is B class Method");
//         }
//     }
//     public static void main(String[] args) {
//         A obj1=new A();
//         obj1.showA();
//         B obj2=new B();
//         obj2.showA();
//         obj2.showB();
//     }
// }


// Multilevel Inheritance:-

// package OOPs;

// public class inheritance {
//     static class A {
    
//         void showA(){
//             System.out.println("It is A class Method");
//         }
//     }
//     static class B extends A{
//         void showB(){
//             System.out.println("It is B class Method");
//         }
//     }
//     static class C extends B {
//         void showC(){
//             System.out.println("It is C class Method");
//         }  
//     }
//     public static void main(String[] args) {
//         A obj1=new A();
//         obj1.showA();
//         System.out.println("-----------------------------");
//         B obj2=new B();
//         obj2.showA();
//         obj2.showB();
//         System.out.println("-----------------------------");
//         C obj3=new C();
//         obj3.showA();
//         obj3.showB();
//         obj3.showC();

//     }
// }


// Heirarchial Inheritance:-

package OOPs;

public class inheritance {
    static class A {
    
        void showA(){
            System.out.println("It is A class Method");
        }
    }
    static class B extends A{
        void showB(){
            System.out.println("It is B class Method");
        }
    }
    static class C extends A {
        void showC(){
            System.out.println("It is C class Method");
        }  
    }
    public static void main(String[] args) {
        A obj1=new A();
        obj1.showA();
        System.out.println("-----------------------------");
        B obj2=new B();
        obj2.showA();
        obj2.showB();
        System.out.println("-----------------------------");
        C obj3=new C();
        obj3.showA();
        obj3.showC();

    }
}


