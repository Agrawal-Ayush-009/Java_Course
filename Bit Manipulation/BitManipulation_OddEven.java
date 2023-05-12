import java.util.*;

public class BitManipulation_OddEven {
    public static void checkOddEven (int n) {
        int bitmask = 1;
        if((n & bitmask) == 1) {
            System.out.println("Odd Number");
        } else{
            System.out.println("Even Number");
        }
            
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkOddEven(n);

    }
}