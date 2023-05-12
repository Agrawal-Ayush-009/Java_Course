import java.util.Arrays;

import java.util.*;

public class Min_Absolute_Difference_Pair {
    public static void main(String[] args) {
        int[] a = {4,1,8,7};
        int[] b = {2,3,6,5};
        int diff = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++) {
            diff += Math.abs(a[i] - b[i]);
        }

        System.out.println(diff);

    }
}