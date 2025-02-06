package OOPs;
public class display{
       void display(int a){
            System.out.println("parameterized constructor");
       }
       void display(){
        System.out.println("no args constructor");
       }
        public static void main(String[] args) {
            display d=new display();
            d.display();
        }
}
