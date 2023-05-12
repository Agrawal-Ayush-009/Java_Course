import java.util.Stack;

public class Stack_Que2AbsolutePath {
    public static String simplified(String str) {
        Stack<String> s = new Stack<>();

        String res = "";
        res += "/";

        for(int i = 0; i < str.length(); i++) {
            String dir = "";

            // Skip All '/';
            while(i < str.length() && str.charAt(i) == '/') {
                i++;
            }

            while(i < str.length() && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }

            if(dir.equals("..") == true) {
                if(!s.isEmpty()) {
                    s.pop();
                }
            } else if(dir.equals(".") == true) {
                continue;
            } else if(dir.length() != 0) {
                s.push(dir);
            }
        }

        Stack<String> New_s = new Stack<>();

        while(!s.isEmpty()) {
            New_s.push(s.pop());
        }

        while(!New_s.isEmpty()) {
            if(New_s.size() != 1) {
                res += New_s.pop() + "/";
            } else {
                res += New_s.pop();
            }
        }

        return res;
    } 
    public static void main (String[] args) {
        String str = "/a/./b/../../c/";

        System.out.println(simplified(str));
    }
}