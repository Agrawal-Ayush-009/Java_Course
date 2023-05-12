public class Assignment2 {
    public static void main (String args[]) {
        int x = 3, y = 4;

        System.out.println("Before Swapping,The value of x = " + x + ", the value of y = " + y);
        //Swapping

        x = x ^ y; // x = 7 (3 ^ 4 = 7)
        y = x ^ y; // y = 3 (7 ^ 4 = 3)
        x = x ^ y; // x = 4 (7 ^ 3 = 4)

        System.out.println("After Swapping, The value of x = " + x + ", the value of y = " + y);
    }
}