public class Permutation {
    public static void findPermutation (String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int a = 0; a < str.length(); a++) {
            String NEWstr = str.substring(0, a) + str.substring(a + 1);
            findPermutation(NEWstr, ans + str.charAt(a));
        }
    }
    public static void main (String args[]) {
        String str = "abc";
        findPermutation(str, "");
    }
}