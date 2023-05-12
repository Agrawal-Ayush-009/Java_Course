import java.util.ArrayList;


public class Container_wMW_BruteForce {
    public static void max_water (ArrayList<Integer> hieght) { // O(n^2)
        int maxWater = Integer.MIN_VALUE;
        for(int i = 0; i < hieght.size(); i++) {
            for(int j = i + 1; j < hieght.size(); j++) {
                int hieght_water = Math.min(hieght.get(i), hieght.get(j));
                int width_water = j - i;
                int water = hieght_water * width_water;
                if(maxWater < water) {
                    maxWater = water;
                }
            }
        }

        System.out.println(maxWater);
    }
    public static void main(String args[]) {
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

        max_water(hieght);

    }
}