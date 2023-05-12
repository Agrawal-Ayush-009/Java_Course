import java.util.Scanner;

public class Assingnment3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int ans;

        System.out.println("The Number before Increasing it by one was = " + x );

        if(x == -1) {
            ans = ~x;
        } else {
            ans = -(~x);
        }

        System.out.println("The Number After Increasing it by one is = " + ans);
    }
}