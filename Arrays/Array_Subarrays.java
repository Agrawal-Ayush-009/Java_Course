public class Array_Subarrays {
    public static void printSubarrays (int num[]) {
        int tsa = 0;
        for(int i = 0; i < num.length; i++) {
            for(int j = i; j < num.length; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                tsa++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Number of Subarrays = " + tsa);
    }
    public static void main (String args[]) {
        int num[] = {2,4,5,3,6};
        printSubarrays(num);
    }
}