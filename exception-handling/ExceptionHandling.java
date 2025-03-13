public class ExceptionHandling {
    public static void main(String[] args) {
        // int a=10/0;
        // System.out.println(a); //Arithmetic exception
        // String s=null;
        // System.out.println(s.length()); // Nullpointer exception
        // int arr[]={1,2};
        // System.out.println(arr[3]); //Array Index out of bound exception
        try {
            int f=5/0;
            System.out.println(f);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("Issue Resolved");
        }
    }
}
