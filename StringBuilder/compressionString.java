import java.util.*;

public class compressionString {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder("");
        int count = 0;

         for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            sb.append(ch);
            count = 1;
            while(i < input.length() - 1 && input.charAt(i) == input.charAt(i+1)) {
                count++;
                i++;
            }
            if(count > 1) {
                sb.append(count);
            }
         }
         System.out.println(sb);
    }
}