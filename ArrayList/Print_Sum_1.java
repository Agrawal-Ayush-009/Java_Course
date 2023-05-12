import java.util.ArrayList;

public class Print_Sum_1 {
    public static boolean findPair (ArrayList<Integer> list, int target, int lp, int rp) { // Just like Container with Maximum Water we can use a while loop
        if(lp >= rp) {
            return false;
        }
        if(list.get(lp) + list.get(rp) == target) {
            // System.out.println("(" + lp + "," + rp + ")");
            return true;
        }
        if(list.get(lp) + list.get(rp) < target) {
            return findPair(list, target, lp + 1, rp);
        }
        if(list.get(lp) + list.get(rp) > target) {
            return findPair(list, target, lp, rp - 1);
        }

        return false;
    }
    public static void main (String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        System.out.println(findPair(list, 10, 0, list.size() - 1));
    }
}