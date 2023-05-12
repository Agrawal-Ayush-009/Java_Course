public class Trapping_Rainwater {
    public static int  rainwater (int num[]) {
        int watercollected = 0;
        int waterLevel[] = new int[num.length];
        int leftMAX[] = new int[num.length];
        int rightMAX[] = new int[num.length];


        leftMAX[0] = num[0];
        rightMAX[num.length - 1] = num[num.length - 1];
        for(int i = 1; i < num.length; i++) {
            leftMAX[i] = Math.max(num[i], leftMAX[i-1]);
        }

        for(int i = num.length - 2; i >= 0; i--) {
            rightMAX[i] = Math.max(num[i], rightMAX[i+1]);
        }

        for(int i = 0; i < num.length; i++) {
            waterLevel[i] = Math.min(leftMAX[i], rightMAX[i]);
        }

        for(int i = 0; i < num.length; i++) {
            watercollected += (waterLevel[i] - num[i])*1;
        }

        return watercollected;
    }
    public static void main (String args[]) {
        int num[] = {4,2,0,6,3,2,5};
        System.out.println(rainwater(num));

        
    }
}