import java.util.*;

import org.w3c.dom.css.CSS2Properties;

public class Question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Complex z1 = new Complex();
        z1.real = sc.nextInt();
        z1.imaginary = sc.nextInt();

        Complex z2 = new Complex();
        z2.real = sc.nextInt();
        z2.imaginary = sc.nextInt();

        int sumReal = Complex.sum(z1.real, z2.real);
        int sumImg = Complex.sum(z1.imaginary, z2.imaginary);

        System.out.println("sum = " + sumReal + " + i" + sumImg);

        int diffReal = Complex.difference(z1.real, z2.real);
        int diffImg = Complex.difference(z1.imaginary, z2.imaginary);

        System.out.println("difference = " + diffReal + " + i " + diffImg);

        int p1to1 = Complex.product(z1.real, z2.real);
        int p1to2 = Complex.product(z1.real, z2.imaginary);
        int p2to1 = Complex.product(z1.imaginary, z2.real);
        int p2to2 = Complex.product(z1.imaginary, z2.imaginary);

        System.out.println("product = " + (p1to1 - p2to2) + " + i" + (p1to2 + p2to1));
    }
}

class Complex {
    int real;
    int imaginary;

    static int sum (int a, int b) {
        return a + b;
    }

    static int difference (int a, int b) {
        return a - b;
    }

    static int product (int a, int b) {
        return a * b;
    }


}