public class OOPS7 {
    public static void main (String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal {

    Horse() {
        super.color = "Brown";
        System.out.println("Horse Constructor is called");
    }
}