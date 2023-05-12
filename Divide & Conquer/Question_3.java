public class Question_3 {
    public static void inversionCount(int num[], int i, int count) {
        if(i == num.length) {
            System.out.println(count);
            return;
        }
        for(int j = i+1; j < num.length; j++) {
            if(num[i] > num[j]) {
                System.out.println("(" + num[i] + "," + num[j] + ")");
                count++;
            }
        }

        inversionCount(num, i + 1, count);
    }
    public static void main (String args[]) {
        int num[] = {2,4,1,3,5};
        inversionCount(num, 0, 0);
    }
}