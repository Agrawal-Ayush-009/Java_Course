public class Keypad_Que2 {
    public static void combination (String str, String ans, int i, String map[]) { // alternative in Solutions;
        if(i == str.length()) {
            System.out.print(ans + " ");
            return;
        }
        char currChar = str.charAt(i);
        String mapping = map[(currChar - '0') - 2];
        for(int a = 0; a < mapping.length(); a++) {
            combination(str, ans + mapping.charAt(a), i + 1, map);
        }
    }
    public static void main(String args[]) {
        String str = "235";
        String[] map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combination(str, "", 0, map);

    }
}