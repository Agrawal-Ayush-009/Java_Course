public class Arrays_Assignment {
    public static boolean repeat (int num[]) {
        for(int i = 0; i < num.length; i++) {
            int j = 0;
            while(j != i) {
                if(num[i] == num[j]) {
                    return true;
                }
                j++;
            }
        }
        return false;
    } 
    public static void main (String args[]) {
        int num[] = {4,7,0,1};
        System.out.println(repeat(num));
    }
}