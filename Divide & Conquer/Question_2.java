public class Question_2 {
    public static int count[] = new int[220];
    public static void majorityElement (int num[], int i) {
        if(i == num.length) {
            for(int a = 0; a < count.length; a++) {
                if(count[a] > num.length/2) {
                    System.out.println(a);
                    return;
                }
            }
            return;
        }
        count[num[i]]++;
        majorityElement(num, i + 1);
    }
    public static void main (String args[]) {
        int num[] = {2,2,1,1,1,2,2,1,1};

        majorityElement(num, 0);

    }
}