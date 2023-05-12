public class Grid_Ways {
    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int permutations(int m, int n) {
        int factN = factorial(n-1);
        int factM = factorial(m-1);
        int factNandM = factorial((n-1 + m-1));

        int ans = (factNandM)/((factN)*(factM));

        return ans;
    }   

    public static int printNoOfWays (int x, int y, int n, int m) {
        if(x == n-1 || y == m - 1) {
            return 1;
        } else if(x == n || y == m) {
            return 0;
        }

        // goes right
       int right = printNoOfWays(x + 1, y, n, m);

        // goes down
       int down = printNoOfWays(x, y + 1, n, m);

       return right + down;
    }
    public static void main (String args[]) {
        int n = 4, m = 4;
        System.out.println(permutations(n, m));
    }
}