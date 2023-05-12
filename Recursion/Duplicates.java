import java.util.*;

public class Duplicates {
    // public static boolean map[] = new boolean[26];
    public static StringBuilder deleteDup (String str,int i, StringBuilder sb, boolean map[]) {
        if(i == str.length()) {
            return sb;
        }
        if(map[(str.charAt(i)-'a')] != true) {
            sb.append(str.charAt(i));
            map[(str.charAt(i)-'a')] = true;
        }

        deleteDup(str, i+1, sb, map);

        return sb;

    }
    public static void main (String args[]) {
        String str = "appnnacollege";
        StringBuilder sb = new StringBuilder("");
        boolean map[] = new boolean[26];
        System.out.println(deleteDup(str, 0,sb, map));
        

        // int alpha = (int)(str.charAt(4) - 'a');
        // System.out.println(alpha);
    }
}