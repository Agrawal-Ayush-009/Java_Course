public class Arrays_Assignment4 {
    public static int trappingRainwater (int hieght[]) {
        int n = hieght.length;
        int waterCollected = 0;
        int waterLevel[] = new int[n];
        int leftMAX[] = new int[n];
        int rightMAX[] = new int[n];
        
        leftMAX[0] = hieght[0];
        for(int i = 1; i < n; i++) {
            leftMAX[i] = Math.max(hieght[i], leftMAX[i-1]);
        }

        rightMAX[n-1] = hieght[n-1];
        for(int i = n-2; i >= 0; i--) {
            rightMAX[i] = Math.max(hieght[i], rightMAX[i+1]);
        }

        for(int i =0; i < n; i++){
            waterLevel[i] = Math.min(leftMAX[i], rightMAX[i]);
        }

        for(int i = 0; i < n; i++) {
            waterCollected += (waterLevel[i] - hieght[i]) * 1;
        }

        return waterCollected;
    }
    public static void main (String args[]) {
        int hieght[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainwater(hieght));
    }
}