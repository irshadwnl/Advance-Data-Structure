public class ChainedException {
    public static void main(String[] args) {
        int arr[]={4,5,6,8,9};
        int divisor=0;
        try {
            for(int i:arr){
                int ans=i/divisor;
                System.out.println(ans);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error Cannot devide by zero");
        }
    }    
}
