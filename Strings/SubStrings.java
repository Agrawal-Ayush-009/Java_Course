public class SubStrings{
    public static void substring (String str, int si, int ei) {
        String newStr = "";
        
        for(int i = si; i < ei; i++) {
            newStr += str.charAt(i);
        }

        System.out.println(newStr);
    }
    public static void main (String args[]) {
        String str = "Tony Stark";

        // substring(str, 1, 4);

        System.out.println(str.substring(1,6));
    }
}