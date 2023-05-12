public class Array_pairs {
    //O(n^2) : time complexity.
    public static void Pairs_in_Arrays (int num[]) {
        int tp = 0;
        for(int i = 0; i < num.length; i++) {
            for(int j = i+1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ")" + " ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = " + tp);
    }
    public static void main (String args[]) {
        int num[] = {1,5,3,6,2,8,0};
        Pairs_in_Arrays(num);
    }
}