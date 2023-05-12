import java.nio.channels.AsynchronousSocketChannel;
import java.util.*;

public class Practice1 {
    public static int countVowels (String str) {
        int count = 0;
        char[] vowels = {'a','e','i','o','u'};
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < vowels.length; j++) {
                if(str.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        System.out.println(countVowels(str));
    }
}