package OopsInDepth;

public class typeCasting {
    public static void main(String[] args) {
        // Object o=new String("Irshad");
        // StringBuffer sb=(StringBuffer)o;//Runtime error dega 

        Object o=new String("Irshad");
        String s=(String)o;

        System.out.println(s);
    }
}
