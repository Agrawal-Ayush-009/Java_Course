import java.util.ArrayList;

public class Que3_FrequentOccurence {
    public static int[] count = new int[1000];
    public static int findOccurence(ArrayList<Integer> nums, int key) {
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == key) {
                count[nums.get(i+1)]++;
            }
        }

        int maxOccurence = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 0; i < count.length ; i++) {
            if(maxOccurence < count[i]) {
                maxOccurence = count[i];
                ans = i;
            }
        }

        return ans;

        
    }
    public static void main (String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);

        int key = 1;

        System.out.println(findOccurence(nums, key));

        
    }
}