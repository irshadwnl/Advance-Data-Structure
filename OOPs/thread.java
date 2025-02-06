// 1st Way:- 

// package OOPs;
// public class thread {
//     public static class A extends Thread {
//         public void run(){
//             for(int i=1;i<=10;i++){
//                 System.out.println("Irshad");
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }   
//     }
//     public static class B extends Thread{
//         public void run(){
//             for(int i=1;i<=10;i++){
//                 System.out.println("Ansari");
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }   
//     }
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = new B();

//         obj1.start();
//         obj2.start();
//     }
// }

// 2nd Way:-

package OOPs;

public class thread {
    public static class A implements Runnable {
        public void run(){
            for(int i=1;i<=10;i++){
                System.out.println("Irshad");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }   
    }
    public static class B  implements Runnable{
        public void run(){
            for(int i=1;i<=10;i++){
                System.out.println("Ansari");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }   
    }
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bye");
    }
}
