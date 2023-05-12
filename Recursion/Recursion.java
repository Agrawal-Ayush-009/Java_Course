public class Recursion {
    public static int exponent_optimized (int x, int n) { // O(log(n)) much better than O(n);
        // if(n == 1) {
        //     return x;
        // }
        if(n == 0) {
            return 1;
        }

        int halfpower = exponent_optimized(x, n/2);

        // if(n % 2 == 0){
        //     return halfpower * halfpower;
        // } else {
        //     return halfpower * halfpower * x; // (n+1)/2 and (n-1)/2 can also be used;
        // }

        int power  = halfpower * halfpower;

        if(n % 2 != 0) {
            power = x * power;
        }

        return power;


    }

    public static int exponent(int x, int n) { // O(n)
        if(n == 0) {
            return 1;
        }
        int expnm1 = exponent(x, n-1);
        int exp = x * expnm1;

        return exp;
    }

    public static int lastOccurence_2 (int[] num, int e, int i) {
        if(i == num.length) {
            return -1;
        }
        int isFound  = lastOccurence_2(num, e, i+1);

        if(isFound == -1 && num[i] == e) {
            return i;
        }

        return isFound;
    } 
    
    public static int lastOccurence (int[] num, int e, int i) {
        if(i < 0) {
            return -1;
        }
        
        if(num[i] == e) {
            return i;
        }
        
        return lastOccurence(num, e, i - 1);
    }

    public static int firstOccurence (int[] num, int e, int i) { // O(n), O(n);
        if(i == num.length) {
            // System.out.println("Not Found");
            return -1;
        }
        if(num[i] == e) {
            // System.out.println("we found " + e + " at " + i);
            return i;
        }

        return firstOccurence(num, e, i + 1);
    }
    

    public static boolean checkSorted(int num[], int a) { // O(n) , O(n)
        if(a == num.length - 1) {
            return true;
        }
        if(num[a] >= num[a+1]) {
            return false;
        }

        return checkSorted(num, a + 1);
    }

    public static int printNthFibonacci (int n) { // time O(2^n) , space O(n)
       if(n == 0) {
        return 0;
       }
       if(n == 1) {
        return 1;
       }

       int fibN = printNthFibonacci(n-1) + printNthFibonacci(n-2);
       return fibN;
    }

    public static void printFibonacci (int count ,int n, int a,int b) {
        if(count == 0) {
            System.out.print(b + " " + a + " ");
            count = 1;
        }
        if(count == n) {
            return;
           
        }
        int sum = a + b;
            b = a;
            a = sum;
        System.out.print(a + " ");
        count++;
        printFibonacci(count, n, a, b);
    }

    public static int printSum (int n) { // O(n), O(n)
        if(n == 0) {
            return 0;
        }

        int sum = n + printSum(n-1);

        return sum;


    } 

    public static int printFact (int n) { // O(n) , O(n)
        if( n == 1 || n == 0) {
            return 1;
        }

        int fact = n * printFact(n - 1);

        return fact;
    }

    public static void printNumIncreasing (int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNumIncreasing(n-1);
        System.out.print(n + " ");
    }

    public static void printNumDecreasing (int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumDecreasing(n-1);
    }


    public static void main(String args[]) {
        // printNumDecreasing(10);
        // printNumIncreasing(100);
        // System.out.println(printFact(6));
        // System.out.println(printSum(10));
        // printFibonacci(0, 9, 1, 0);
        // System.out.println(printNthFibonacci(8));

        int num[] = {4,5,9,5,7,5};
        // if(checkSorted(num,0)) {
        //     System.out.println("Sorted");
        // } else {
        //     System.out.println("Unsorted");
        // }

        // System.out.println(firstOccurence(num, 8, 0));

        // System.out.println(lastOccurence(num, 5, num.length - 1));

        // System.out.println(lastOccurence_2(num, 5, 0));

        // System.out.println(exponent(2, 10));

        System.out.println(exponent_optimized(2, 8));

    }
}