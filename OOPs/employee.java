package OOPs;
public  class employee {
    private int empid;
    public  int getter(){
        return this.empid;
    }
    public  void setter(int empid){
        this.empid=empid;
    }
   public static void main(String[] args) {
        // encapsulation e=new encapsulation();
        employee e1=new employee();
        e1.setter(28);
        System.out.println(e1.getter());
        System.out.println(e1.empid); 
        // N obj=new N();
    }
    class N{
        N(){
            employee e2=new employee();
            e2.setter(19);
            System.out.println(e2.getter());
        }
    }
    
}




// package OOPs;
// public class encapsulation {
//     public static class employee {
//         private int empid;
//         public void print(int empid){
//             System.out.println(empid);
//         }
//         // public void set(int empid1){
//         //     this.empid=empid1;
//         // }
//         // public int getEmpId(){
//         //     return empid;
//         // }
        
//     }
//     public static class employee2 extends employee{
//         public void show(){
//             // System.out.println(empid);
//         }
//     }   
//     public static void main(String[] args) {
//         employee e1=new employee();
//         // e1.print(5);
//         System.out.println(e1.empid); 
//         // System.out.println(e1.getEmpId());
//     }
// }

