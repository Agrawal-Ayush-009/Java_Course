import javax.swing.plaf.synth.SynthScrollBarUI;

public class OOPS6{
    public static void main (String args[]) {
        Student s1 = new Student();
        s1.setname("Ayush");
        s1.schoolName = "RIS"; // Once the static variable is declared by one object then it will be automatically declared for rest of the objects;
        System.out.println(s1.getname());

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC"; // now the schoolname will be ABC;

    }
}

class Student {

    static int returnPercentage(int phy, int chem, int math) {
        return (math + chem + phy) / 3;
    }

    String name;
    int rollNo;

    static String schoolName;

    void setname(String name) {
        this.name = name;
    }

    String getname() {
        return name;
    }
}