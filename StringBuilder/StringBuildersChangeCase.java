import java.util.*;

public class StringBuildersChangeCase {
    public static String UpperCase (String input) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(input.charAt(0));
        sb.append(ch);
        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == ' ' && i < input.length() - 1) {
                sb.append(' ');
                i++;
                ch = Character.toUpperCase(input.charAt(i));
                sb.append(ch);
            } else {
                sb.append(input.charAt(i));                                                                                                                                                              
            }
        }

        return sb.toString();
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        System.out.println(UpperCase(input));


        
    }
}