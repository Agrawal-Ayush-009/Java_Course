import java.util.Scanner;
import java.util.Stack;

public class stack_postfix {
    public static void main(String[] args) {
        int num = 499348;
        StringBuilder sb = new StringBuilder("");
        sb.append(num);
        System.out.println(sb);
        // String s = sb.toString();
        // int x = Integer.parseInt(s);
        // System.out.println(x);
        // Stack<Integer> s = new Stack<>();
        // Scanner sc = new Scanner(System.in);
        // int n = 0;
        // System.out.println("Enter the Length of postfix expression:\n");
        // n = sc.nextInt();
        // String postfix = "" 

        // for(int i = 0; i < n; i++){
        //     postfix = sc.next();
        // }
        // postfix[n] = ')';

        // for(int i = 0; i < n+1; i++){
        //     char curr = postfix[i];
        //     if(curr == '+'){
        //         int a = s.pop();
        //         int b = s.pop();
    
        //         int res = b + a;
        //         s.push(res);
        //     }else if(curr == '-'){
        //         int a = s.pop();
        //         int b = s.pop();
    
        //         int res = b - a;
        //         s.push(res);
        //     }else if(curr == '*'){
        //         int a = s.pop();
        //         int b = s.pop();
    
        //         int res = b * a;
        //         s.push(res);
        //     }else if(curr == '/'){
        //         int a = s.pop();
        //         int b = s.pop();
    
        //         int res = b / a;
        //         s.push(res);
        //     }else if(curr == ')'){
        //         printf("Result is: %d", s.pop());
        //         break;
        //     }else{
        //         s.push((int)(curr - '0'));
        //     }
        // }
    }
}
