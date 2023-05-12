import java.util.*;

public class PowerOf2 {
    public static void checkPowerOf2 (int n) {
        int check = n & (n-1);

        if(check == 0) {
            System.out.println("Number is a Power Of Two");
        } else {
            System.out.println("Number is not a Power of Two");
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkPowerOf2(n);
    }
}