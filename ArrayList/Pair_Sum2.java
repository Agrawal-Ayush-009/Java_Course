import java.util.ArrayList;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Pair_Sum2 {
    public static boolean find_pair (ArrayList<Integer> list, int target) {
        int pivot = 0;

        for(int i = 0; i < list.size(); i++) {
            if(i <= list.size()-1 && list.get(i) > list.get(i+1)) {
                pivot = i;
                break;
            }
        }
        int rp = pivot;
        int lp = pivot + 1;
        int n = list.size();

        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target) {
                System.out.println("(" + lp + "," + rp + ")");
                return true;
            }

            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }

            if(list.get(lp) + list.get(rp) > target) {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }
    public static void main (String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        

        System.out.println(find_pair(list, target));
        // find_pair(list, target);
        
    }
}