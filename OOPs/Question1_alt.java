import java.util.*;

class Complex {

    int real;
    int img;

    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    public static Complex sum(Complex a,Complex b) {
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public static Complex prod(Complex a, Complex b) {
        return new Complex (((a.real*b.real) - (a.img*b.img)), ((a.real*b.img) + (a.img*b.real)));
    }

    public void printComplex() {
        if(real == 0 && img != 0) {
            System.out.println("i" + img);
        } else if (real != 0 && img == 0) {
            System.out.println(real);
        } else {
            System.out.println(real + " + i" + img);
        }
    }
}
class Question1_alt {
    public static void main (String args[]) {
        Complex c = new Complex(3, 2);
        Complex d = new Complex(4, 5);

        Complex e = Complex.sum(c,d);
        Complex f = Complex.diff(c,d);
        Complex g = Complex.prod(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();

    }
}