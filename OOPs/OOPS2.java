public class OOPS2 {
    public static void main (String args[]) {
        Fish f1 = new Fish();
        f1.fins = 4;
        f1.eat();
        f1.breathe();
        f1.swim();
        System.out.println(f1.fins);

        // Dog dobby = new Dog();
        // dobby.legs = 4;
        // dobby.breed = "German Shepherd";
        // dobby.eat();
        // System.out.println(dobby.legs);
        // System.out.println(dobby.breed);
    }
}
//Base Class
class Animal {

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }

}
// Derived Class
class Fish extends Animal{

    int fins;

    void swim() {
        System.out.println("Swims");
    }
}

class Mammal extends Animal {
    int legs;
}

// class Fish extends Animal {
//     void swim() {
//        System.out.println("Swims");
//     }
// }

// class Bird extends Animal {
//     void fly() {
//        System.out.println("flies");
//     }
// }

// class Mammal extends Animal {
//     void walk() {
//        System.out.println("walks");
//     }
// }

// class Dog extends Mammal { // Multi Level Inheritance
//     String breed;
// }