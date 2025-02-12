// package OopsInDepth;
// class Base1{
//     void m1(){

//     }
// }
// class Base2 {}
// class Der1 extends Base1{
//     void m2(){

//     }
// }
// class Der2 extends Base1{}
// class Der3 extends Base2{}
// class Der4 extends Base2{}
// public class Test {
//     public static void main(String[] args) {
//         Base2 b=new Der4();
//         Der4 d=(Der4)b;
//         // Base1 b1=(Base1)b; //compile err
//         Base2 b2= (Base2)b;
//         // Object o=(Der3)b; //Runtime err
//         // Base2 b3=(Base1)b; // compile err

//         // Base1 a=new (Base1);


//         String s=new String("Irshad");
//         Object n=(Object)s;
//         System.out.println(n==s);

//         // Base1 f=new Der1();
//         // f.m2();

//     }
// }


package OopsInDepth;
class A{
    void m1(){
        System.out.println("A");
    }
}
class B extends A{
    void m1(){
        System.out.println("B");
    }
}
class C extends B{
    void m1(){
        System.out.println("C");
    }
}
public class Test {
    public static void main(String[] args) {
        B c=new B();
        c.m1();
        ((A)c).m1();
        // ((B)c).m1();
        // ((A)((B)c)).m1(); 
    }
}
