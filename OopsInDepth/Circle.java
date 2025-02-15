package OopsInDepth;
class Earth {
    // final double PI;
    // {
    //     PI=3.14;
    // }

    static final double PI;
    static{
        PI=3.14;
    }
    // Earth e1;
    // {
    //     e1=new Earth();
    // }
}
public class Circle{
    public static void main(String[] args) {
        // Earth e1=new Earth();
        System.out.println(Earth.PI);
    }
}

