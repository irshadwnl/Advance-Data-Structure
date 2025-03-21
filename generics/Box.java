package generics;

public class Box<T extends Number> { // T pe hum condition laga skte hai usi ko bolte hai bounded parameters
    private T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
    
}
