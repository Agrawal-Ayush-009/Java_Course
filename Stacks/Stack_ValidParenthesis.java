import java.util.Stack;

public class Stack_ValidParenthesis {
    public static boolean isValid(String str) { //O(n) Time Complexity
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {// opening bracket
                s.push(ch);
            } else { // closing bracket

                if(s.isEmpty()) {// if there are only closing bracket in the string
                    return false;
                }

                if(s.peek() == '(' && ch == ')' //()
                || s.peek() == '{' && ch == '}' //{}
                || s.peek() == '[' && ch == ']') { //[]
                   
                    s.pop();
                    
                }
            }
        }

        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        String str = "[{()}](){}[]";
        System.out.println(isValid(str));

    }
}