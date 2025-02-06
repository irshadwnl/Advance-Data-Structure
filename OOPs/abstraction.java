package OOPs;

public class abstraction {
    abstract static class vehicle{
        int tyres;
        abstract void start();
    }
    static class car extends vehicle{
        car(){
            this.tyres=4;
        }
        void start(){
            System.out.println("Starts with key "+"It has "+tyres+" tyres");
        }
    }
    static class bike extends vehicle{
        bike(){
            this.tyres=2;
        }
        void start(){
            System.out.println("Starts with self "+"It has "+tyres+" tyres");
        }
    }
    public static void main(String[] args) {
        car alto =new car();
        alto.start();
        bike pulsar = new bike();
        pulsar.start();
        car ertiga =new car();
        ertiga.start();

        vehicle newCar=new car(); //refference create kr skte hai but object create nhi kr skte
        newCar.start();

    }
}
