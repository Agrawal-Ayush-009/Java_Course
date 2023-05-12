import java.util.*;

import javax.sound.midi.Synthesizer;

public class Array_SumOfArrays3 {
    public static void kadanes (int num[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        System.out.println(ms);


        for(int i = 0; i < num.length; i++) {
                cs += num[i];
                if(cs < 0) {
                    cs = 0;
                }
    
                ms = Math.max(cs, ms);
        }
        System.out.println("The Max Sum is = " + ms);
    }

    public static void main (String args[]) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};

        kadanes(num);
    }
}