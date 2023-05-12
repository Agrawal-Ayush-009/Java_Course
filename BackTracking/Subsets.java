public class Subsets {
    public static void printSubsets(String str, String newStr, int i) {
        if(i == str.length()) {
            if(newStr.length() == 0) {
                System.out.println("Empty String");
            } else {
                System.out.println(newStr);
            }
            return;
        }

        printSubsets(str, newStr + str.charAt(i), i + 1);

        printSubsets(str, newStr, i + 1);
    }
    public static void main (String args[]) {
        String str = "abc";
        printSubsets(str, "", 0);
    }
}