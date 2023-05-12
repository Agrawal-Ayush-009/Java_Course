import java.util.*;

public class Question_2 {
    public static void convertToEnglish (String str, String map[], int i) { // alternative in solution;
        if(i == str.length()){
            return;
        }
        System.out.print(map[(int)(str.charAt(i) - '0')] + " ");

        convertToEnglish(str, map, i+1);

        
    }
    public static void main (String args[]) {
        String map[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        int num = 1947;
        String str = Integer.toString(num);
        convertToEnglish(str, map, 0);

    }
}