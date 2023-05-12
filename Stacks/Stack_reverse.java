import java.util.Stack;

public class Stack_reverse {
    public static void pushBottom(Stack<Integer> s, int data) {
        if(s.isEmpty() == true) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public static void reverseStack (Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder ans = new StringBuilder();

        
        while(s.isEmpty() != true) {
            ans.append(s.pop());
        }

        return ans.toString();
    }

    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
           }
    }
    public static void main(String[] args) {
       Stack<Integer> s = new Stack<>();

       s.push(1);
       s.push(2);
       s.push(3);

    //    printStack(s);
       reverseStack(s);
       printStack(s);
    }
}