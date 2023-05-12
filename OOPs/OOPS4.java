public class OOPS4 {
    public static void main (String args[]) {
        Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color); // here only initialised value(by constructor of parent class) will be output;

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        c.changeColor();
        System.out.println(c.color); // here change value will be output because changeColor function of the subclass is called already;

        // Mustang myHorse = new Mustang();
        // // Animal -> Horse -> Mustang;

        System.out.println(h.name);


    }
}

abstract class Animal {

    String color;

    Animal() {
        color = "Light Browm";
        System.out.println("Animal Constructor called..");
    }

    // abstract function don't have implementation, it only gives idea about something and can have saparate implementation for each subClass;
    abstract void walk();

    void eat() {
        System.out.println("Animal Eats");
    }
}

class Horse extends Animal {

    String name  = "Dragon";

    Horse () {
        System.out.println("Horse Constructor called...");
    }

    void changeColor() {
        color = "Dark Brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");// each subclass will have different implementation;
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor is called....");
    }
} 

class Chicken extends Animal {

    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs");// each subclass will have different implementation;
    }
}