// package OopsInDepth;

// public class Student {
//     String name;
//     int roll;
//     Student(String name,int roll){
//         this.name=name;
//         this.roll=roll;
//     }
//     public static void main(String[] args) {
//         Student s1=new Student("Sam",101);
//         System.out.println(s1.name + s1.roll);
//     }
// }


package OopsInDepth;

public class Student {
    Student(){
        System.out.println("Constructor Executed");     
    }
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
    }
}
