import javax.sql.rowset.spi.SyncResolver;

public class OOPS3 {
    public static void main (String args[]) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,5));
        // System.out.println(calc.sum(1,3,5));
        // System.out.println(calc.sum((float)1.5, (float)1.5));

        Goat g = new Goat();
        g.eat();
    }
}
//POLYMORPHISM

class Animal { // Method Overriding.
    void eat() {
        System.out.println("Eats Anything");
    }
}

class Goat extends Animal {
    void eat() {
        System.out.println("Eats Grass");
    }
}

class Calculator {// Method Overloading.
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum (int a, int b, int c) {
        return a + b + c;
    }
}