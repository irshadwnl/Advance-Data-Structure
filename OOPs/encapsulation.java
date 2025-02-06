package OOPs;
public class encapsulation {
    public static class employee {
        private int empid;
        
    }
    public static void main(String[] args) {
        employee e1=new employee();
        System.out.println(e1.empid); 
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

