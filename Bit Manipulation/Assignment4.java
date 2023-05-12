public class Assignment4 {
    public static void convertLowerCase (String input) {
        StringBuilder sb = new StringBuilder(input);
        for(int i = 0; i < input.length(); i++) {
            if(65 <= (int)input.charAt(i) && (int)input.charAt(i) <= 90) { // (int)'A' == 65; (int)'Z' == 90;
                sb.delete(i, i+1);
                sb.insert(i, (char)(input.charAt(i) | ' '));
            }
        }

        System.out.println(sb);
    }

    public static void main (String args[]) {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        convertLowerCase(input);
    }
}