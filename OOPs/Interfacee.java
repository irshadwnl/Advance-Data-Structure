package OOPs;

public class Interfacee {
    public interface i1 {
         void display();
         default void play(){ // we can also create cocrete method after 8.2 version of java
            System.out.println("I m playing");
         }
    }
    public interface i2 extends i1 {
        void show();
    }
    static class test implements i1,i2{
        public void display(){
            System.out.println("2");
        }
        public void show(){
            System.out.println("7");
        }
    }
    public static void main(String[] args) {
        test t = new test();
        t.display();
        t.show();
        i2 i=new test();
        i.play();
    }
}
