package generics;
interface Printable{
    void print();
}

class MyNumber extends Number implements Printable{
    private final int value;

    public MyNumber(int value) {
        this.value=value;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.println("MyNumber: "+value);
    }
    
}

class Boxx<T extends Number & Printable>{
    private T item;

    // T item = new T();
    public Boxx(T item){
        this.item=item;
    }
    public void display(){
        item.print();
    }
    public T getItem(){
        return item;
    }
}

public class Test {
    public static void main(String[] args) {
        // MyNumber mynumber=;
        Boxx<MyNumber> box=new Boxx(new MyNumber(10));
        box.display();
    }
    
}