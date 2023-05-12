import java.util.Arrays;
import java.util.Comparator;

public class Fractional_KnapSack {
    public static void main (String[] args) {
        int[] val = {60, 100, 120};
        int[] wieght = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double[val.length][2];
        //0th -> Index , 1st -> ratio

        for(int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (val[i]/wieght[i]);
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int value = 0;

        for(int i = val.length - 1; i >= 0; i--) {
            if(w >= wieght[(int)ratio[i][0]]) {
                w = w - wieght[(int)ratio[i][0]];
                value += val[(int)ratio[i][0]];
            } else {
                value = value + ((int)ratio[i][1] * w);
                break;
            }
        }

        System.out.println("Highest value of cost = " + value);
    }
}