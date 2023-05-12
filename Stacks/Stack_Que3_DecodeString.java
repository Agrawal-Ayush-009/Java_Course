import java.util.Stack;

public class Stack_Que3_DecodeString {
    public static String decodeString(String str) {
        Stack<Character> stringStack = new Stack<>();
        Stack<Integer> integerStack = new Stack<>();
        String result = "", temp = "";

        for(int i = 0; i < str.length(); i++) {
            int count = 0;
            if(Character.isDigit(str.charAt(i))) {
                while(Character.isDigit(str.charAt(i))) {
                    count = count * 10 + (str.charAt(i) - '0');
                    i++;
                }

                i--;
                integerStack.push(count);
            } else if(str.charAt(i) == '[') {
                if(Character.isDigit(str.charAt(i-1))) {
                    stringStack.push(str.charAt(i));
                } else {
                    stringStack.push(str.charAt(i));
                    integerStack.push(1);
                }
            } else if(str.charAt(i) == ']') {
                temp = "";
                count = 0;
                if(!integerStack.isEmpty()) {
                    count = integerStack.peek();
                    integerStack.pop();
                }

                while(!stringStack.isEmpty() && stringStack.peek() != '[') {
                    temp = stringStack.peek() + temp;
                    stringStack.pop();
                }

                if(!stringStack.isEmpty() && stringStack.peek() == '[') {
                    stringStack.pop();
                }

                for(int a = 0; a < count; a++) {
                    result = result + temp;
                }

                for(int a = 0; a < result.length(); a++) {
                    stringStack.push(result.charAt(a));
                }

                result = "";

            } else {
                stringStack.push(str.charAt(i));
            }
        }

        while(!stringStack.isEmpty()) {
            result = stringStack.pop() + result;
        }
        return result;
    }
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "3[b2[cv]]";
        System.out.println(decodeString(str));

        // while(!s.isEmpty()) {
        //     System.out.print(s.pop() + " ");
        // }


        // int n = 'b' - '0';
        // System.out.println(n);
    }
}