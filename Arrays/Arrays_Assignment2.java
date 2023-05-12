public class Arrays_Assignment2 {
    public static int findTargetIndx (int num[], int target, int idx){
        rotateArray(num, idx);
        for(int i = 0; i < num.length; i++) {
            if(num[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void rotateArray (int num[], int idx) {
        int newNum[] = new int[num.length];
        for(int i = idx, j = 0; i < num.length; i++, j++) {
            newNum[j] = num[i];
        }

        for(int i = 0, j = num.length - idx ; i <= idx - 1; j++, i++) {
           newNum[j] = num[i];
        }

        for(int i = 0 ; i < num.length; i++) {
            num[i] = newNum[i];
        }
    }
    public static void main (String args[]) {
        int num[] = {1};
        int target = 0;
        int idx = 0;
       System.out.println(findTargetIndx(num, target, idx));
       

    }
}