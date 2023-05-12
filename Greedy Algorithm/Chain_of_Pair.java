import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Chain_of_Pair {
    public static void main(String[] args) {
        int [][] pair = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int maxChain = 1;
        int lastend = pair[0][1];

        for(int i = 1; i < pair.length; i++) {
            if(lastend < pair[i][0]) {
                maxChain++;
                lastend = pair[i][1];
            }
        }

        System.out.println("Maximum No of Elements in Chain = " + maxChain);

        
        
    }
}