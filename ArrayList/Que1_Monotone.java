import java.util.*;

public class Que1_Monotone { // alternate in solutions
    public static boolean find_decreasing (ArrayList<Integer> num, int i) {
        if(i == num.size() - 1) {
            return true;
        }
        if(num.get(i) >= num.get(i+1)) {
            if(find_decreasing(num, i + 1) == true) {
                return true;
            }
        }
        
        return false;
    }

    public static boolean find_increasing (ArrayList<Integer> num, int i) {
        if(i == num.size() - 1) {
            return true;
        }
        if(num.get(i) <= num.get(i+1)) {
            if(find_increasing(num, i + 1) == true) {
                return true;
            }
        }     

        return false;
    }
    public static void main (String args[]) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(2);
        num.add(3);

        int i = 0;

        if(num.get(i) <= num.get(i + 1)) {
            System.out.println(find_increasing(num,0));
        } else{
            System.out.println(find_decreasing(num, 0));
        }
        
    }
}