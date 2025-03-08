package OOPs;

class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class C extends A {
    void show() {
        System.out.println("Class C");
    }
}

// This would cause the diamond problem if allowed
// class D extends B, C {
//     // Ambiguity: Should D inherit show() from B or C?
// }

public class DiamondProblemExample {
    public static void main(String[] args) {
        // This would be ambiguous if Java allowed multiple inheritance with classes
    }
}
