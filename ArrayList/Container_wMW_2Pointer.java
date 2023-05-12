import java.util.ArrayList;

public class Container_wMW_2Pointer {// Time Complexity = O(n);
    public static void max_water(ArrayList<Integer> hieght, int lp, int rp,int maxWater) { 
        // We can use a while loop istead of the recursion
        // while(lp < rp) {
        //     int hieght_water = Math.min(hieght.get(lp), hieght.get(rp));
        //     int width_water = rp - lp;
        //     int water = hieght_water * width_water;
        //     if(maxWater < water) {
        //         maxWater = water;
        //     }

        //     if(hieght.get(lp) < hieght.get(rp)) {
        //         lp++;
        //     } else {
        //         rp--;
        //     }
        // } 
        
        // System.out.println(maxWater);

        // Recursion
        if(lp >= rp) {
            System.out.println(maxWater);
            return;
        }
        int hieght_water = Math.min(hieght.get(lp), hieght.get(rp));
        int width_water = rp-lp; 
        int water = hieght_water * width_water;
        if(maxWater < water) {
            maxWater = water;
        }
        if(hieght.get(lp) < hieght.get(rp)) { // here we are moving the small bar always because hieght of water level is decided by the small hieght bar(to get the larger hieght in place of small hieght)
            max_water(hieght, lp + 1, rp, maxWater);  
        } else {
            max_water(hieght, lp, rp - 1, maxWater);
        }
    }
    public static void main (String args[]) {
        ArrayList<Integer> hieght = new ArrayList<>();
        hieght.add(1);
        hieght.add(8);
        hieght.add(6);
        hieght.add(2);
        hieght.add(5);
        hieght.add(4);
        hieght.add(8);
        hieght.add(3);
        hieght.add(7);

        max_water(hieght, 0, hieght.size() - 1, Integer.MIN_VALUE);
    }
}