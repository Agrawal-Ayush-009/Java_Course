public class Question_4 {
    public static void subStrings(String str, String newStr, int si, int ei, int count) { // alternative in solutions;
        if(si == str.length()) {
            System.out.println("The Total No. of Subset with given COndition are " +  count);
            return;
        }

       for(int i = si; i <= ei; i++){
        newStr += str.charAt(i);
        if(newStr.charAt(0) == newStr.charAt(newStr.length() - 1)) {
            System.out.println(newStr);
            count++;
        }
       }
       subStrings(str, "", si + 1, ei, count);
    }
    public static void main (String args[]) {
        String str = "abcab";
        subStrings(str, "", 0, str.length() - 1, 0);
        
    }
}