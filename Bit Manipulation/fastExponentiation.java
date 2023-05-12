public class fastExponentiation {
    public static void fastExponentiationFn (int a, int n) {
        int ans = 1;
        while(n > 0) {
            if((n & 1) != 0) {
                ans = ans * a;
            } else {
                ans = ans * 1;
            }

            a = a*a;
            n = n >> 1;
        }

        System.out.println(ans);
    }
    
    public static void main (String args[]) {
        fastExponentiationFn(7, 2);
        
    }
}