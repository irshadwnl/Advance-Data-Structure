package OOPs;
public class constructor {
    static class Employee{
        String name;
        int emp_id;
        public Employee(String name,int emp_id){
            this.name=name;
            this .emp_id=emp_id;
        }
    }
    public static void main(String[] args) {
        Employee e1=new Employee("Madmax",101);
        System.out.println(e1.name);
    }
}


// Types of constructor:-
//1.Default Constructor (  by default it creates a constructor at compile time )

// package OOPs;
// public class constructor {
//     static class Employee{
//         int emp_id;
//     }
//     public static void main(String[] args) {
//         Employee e1=new Employee();
//         System.out.println(e1.emp_id);
//     }
// }


//2.No Argument constructor:-
// package OOPs;
// public class constructor {
//     static class Employee{
//         int emp_id;
//         public Employee(){

//         }
//     }
//     public static void main(String[] args) {
//         Employee e1=new Employee();
//         System.out.println(e1.emp_id);
//     }
// }


//3.Parameterized Constructor :- 
// package OOPs;
// public class constructor {
//     static class Employee{
//         String name;
//         int emp_id;
//         public Employee(String name,int emp_id){
//             this.name=name;
//             this .emp_id=emp_id;
//         }
//     }
//     public static void main(String[] args) {
//         Employee e1=new Employee("Madmax",101);
//         System.out.println(e1.name);
//     }
// }