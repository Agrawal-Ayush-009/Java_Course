public class StringPalindrome {
    public static boolean checkPalindrome(String str) {
        int n = str.length();
        boolean flag = true;
        for(int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                flag = false;
            }
        }
        return flag;
    }
    public static void main (String args[]) {
        String str = "naman";
        if(checkPalindrome(str)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }

    }
}