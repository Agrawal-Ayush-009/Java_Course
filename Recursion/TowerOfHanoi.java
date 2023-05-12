public class TowerOfHanoi {
    public static void printStepsTowOfHanoi (int n , String src, String help, String dest) {
        if(n == 1) {
            System.out.println("Shift Disk " + n + " from " + src + " to " + dest);
            return;
        }
        // shifting n-1 disk from src to help using dest as help;
        printStepsTowOfHanoi(n - 1, src, dest, help);

        // shifting nth disk from src to dest;
        System.out.println("Shift Disk " + n + " from " + src + " to " + dest);

        // shifting remaining disk from help to dest using src as help;
        printStepsTowOfHanoi(n - 1, help, src, dest);

    }
    public static void main (String args[]) {
        int n = 3;
        String input = new String();
        input = "Ayush";
        System.out.println(input);
        // printStepsTowOfHanoi(n, "A", "B", "C");
    }
}