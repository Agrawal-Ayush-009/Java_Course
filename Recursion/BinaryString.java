public class BinaryString {
    public static void printBinaryString (int n, int lastPlace, String sb) {
        if(n == 0) {
            System.out.println(sb);
            return;
        }
        // if(lastPlace == 0) {
        //     printBinaryString(n-1, 0, sb + "0");
        //     printBinaryString(n-1, 1, sb + "1");
        // }else{
        //     printBinaryString(n-1, 0, sb + "0");
        // }

        printBinaryString(n-1, 0, sb + "0");
        if(lastPlace == 0) {
            printBinaryString(n-1, 1, sb + "1");
        }
    }
    public static void main (String args[]) {
        printBinaryString(4, 0, "");
    }
}