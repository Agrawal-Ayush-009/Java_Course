import java.util.*;

public class Q1_BinaryTill_N {
    public static void printBinaryTillN(int N, Queue<Integer> q) {
        int num = 1;
        
        while(num <= N) {
            int n = num;
            int binary = 0;
            int pow = 0;
            while(n >= 1) {
                int dig = n % 2;
                binary = binary + ((int)Math.pow(10, pow) * dig);
                pow++;
                n = n / 2;
            }
            q.add(binary);
            num++;
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printBinaryTillN(N, q);

        // while(!q.isEmpty()) {
        //     System.out.print(q.remove() + " ");
        // }

        System.out.print(q);
    }
}