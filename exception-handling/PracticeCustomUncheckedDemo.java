class NullException extends RuntimeException{
    public NullException(String msg) {
        super(msg);
    }
}


public class PracticeCustomUncheckedDemo {
    public static void NullPointer(String str){
        if(str==null){
            throw new NullException("Caught Null Pointer Exception");
        }
        System.out.println("Result: "+str.length());
    }
    public static void main(String[] args) {
        try {
            String f=null;
            NullPointer(f);
        } catch (NullException e) {
            System.out.println(e.getMessage());
        }
    }
}
