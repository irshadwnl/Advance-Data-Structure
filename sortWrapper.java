import java.util.*;
public class sortWrapper {
    public static  class Student {
        int id;
        String name;
        int age;
        public Student(int id,String name,int age){
            this.id=id;
            this.name=name;
            this.age=age;
        }
        @Override
        public String toString(){
                return "ID: " + id + ", Name: " + name + ", Age: " + age;
            }
        }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(2110990884,"Irshad",21));
        list.add(new Student(2110990882,"Saif",22));
        list.add(new Student(2110990887,"Mohit",19));
        Collections.sort(list, Comparator.comparing(a -> a.age));
        for(Student student:list){
            System.out.println(student);
        }
    }
}
