import java.util.Stack;

public class Stack_DuplicateParentheses {
    public static boolean isDuplicate(String str) { // O(n);
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != ')') {
                s.push(ch);
            } else {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count ++;
                }

                if(count < 1) {
                    return true;
                }
                s.pop(); // (
            }
        }

            return false;
    }
    public static void main (String[] args) {
        String str = "((a+b)+(c+d))";

        if(isDuplicate(str)) {
            System.out.println("Duplicate Parentheses Exists");
        } else {
            System.out.println("Duplicate Parentheses Don't Exists");
        }

    }
}