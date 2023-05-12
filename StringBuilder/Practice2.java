import java.util.*;

public class Practice2{
    public static boolean checkAnagram2 (String str1, String str2) {
        boolean result = false;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            
            char[] charArraystr1 = str1.toCharArray();
            char[] charArraystr2 = str2.toCharArray();

            Arrays.sort(charArraystr1);
            Arrays.sort(charArraystr2);

            result = Arrays.equals(charArraystr1, charArraystr2);
            
        }
        
        return result;
    }

    public static boolean checkAnagram (String str1, String str2) {
        int count = 0;
        for(int i = 0; i < str1.length(); i++) {
            for(int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    count++;
                }
            }
        }

        if(count == str1.length() && str1.length() == str2.length()){
            return true;
        }
        return false;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        StringBuilder sb = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        if(checkAnagram2(str1, str2)) {
            System.out.println("The two words are ANAGRAM");
        } else {
            System.out.println("The two words are not ANAGRAMS");
        }


    }
}
