import javax.sound.midi.Synthesizer;

public class OOPS {
    public static void main (String args[]) {
        // Pen p1 = new Pen(); // created a object named p1;

        // p1.setColor("Blue");
        // System.out.println(p1.getColor());

        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // p1.setColor("Red");
        // // p1.color = "Red";  //this can also work no error;
        // System.out.println(p1.getColor());

        // BankAccount myAcc = new BankAccount();
        // myAcc.userName = "Ayush Agrawal";
        // myAcc.setPassword("KingAyush");


        // Student s3 = new Student("Ayush Agrawal");
        // System.out.println(s1.name);
        // Student s2 = new Student(21);     // This called constructor overloading; (POLYMORPHISM)
        Student s1 = new Student();

        s1.name = "Ayush Agrawal";
        s1.rollNumber = 21;
        s1.password = "abcd";
        s1.marks[0] = 90;
        s1.marks[1] = 80;
        s1.marks[2] = 100;

        Student s2 = new Student(s1);
        s2.password = "xyz";

        s1.marks[0] = 60;
        for(int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
            System.out.println(s2.password);
        }
    }
}

class Student {
    String name;
    int rollNumber;
    String password;
    int marks[];

    // Student(Student s1) { // Shallow Copy Constructor
    //     this.name = s1.name;
    //     this.rollNumber = s1.rollNumber;
    //     marks = new int[3];
    //     this.marks = s1.marks; 
    // }

    // Deep Copy Constructor
    Student(Student s1) {
        this.name = s1.name;
        this.rollNumber = s1.rollNumber;
        marks = new int[3];
        for(int i = 0; i < marks.length; i++) { // Here we wrote the loop to assign value one by one;
            this.marks[i] = s1.marks[i];
        }
    }


    Student(String name) { // if we want to initialise any value in any object during creation then we have to creat a constructor on our own;
        this.name = name;
        marks = new int[3];
    }
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called.......");
    }

    Student(int rollNumber) {
        marks = new int[3];
        this.rollNumber = rollNumber;
    }
}

class BankAccount {
    public String userName; // visisble Everywhere;
    private String password; //visible Only within this class;

    public void setPassword (String pwd) { // we can only set the password with this function in main function but we cannot access the password outside this class
        password = pwd;
    }


}

// Creeated a Pen named Class to make new pens;
class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color; // GETTER
    }

    int getTip() {
        return this.tip; // GETTER
    }

    void setColor(String newColor) { // this is SETTER
        color = newColor;
    }

    void setTip (int newTip) { // this is SETTER
        tip = newTip;
    }
}

