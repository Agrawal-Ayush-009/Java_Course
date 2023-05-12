import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer ver[] = {2,1,3,1,4};
        Integer hor[] = {4,1,2};

        Arrays.sort(ver, Collections.reverseOrder());
        Arrays.sort(hor, Collections.reverseOrder());
        
        int v = 0;
        int h = 0;
        int ver_pieces = 1;
        int hor_pieces = 1;
        int totalCost = 0;
        while(v <= ver.length - 1 && h <= hor.length - 1) {
            if(ver[v] <= hor[h]) {
                totalCost += (hor[h] * ver_pieces);
                hor_pieces++;
                h++;
            }else if(ver[v] > hor[h]) {
                totalCost += (ver[v] * hor_pieces);
                ver_pieces++;
                v++;
            }
        }

        while(v <= ver.length - 1) {
            totalCost += (ver[v] * hor_pieces);
            ver_pieces++;
            v++;
        }

        while(h <= hor.length - 1) {
            totalCost += (hor[h] * ver_pieces);
            hor_pieces++;
            h++;
        }

        System.out.println("Min Cost of cutting into pieces = " + totalCost);
        // System.out.println("Total No. of Pieces  = " + hor_pieces * ver_pieces);
    }   
}