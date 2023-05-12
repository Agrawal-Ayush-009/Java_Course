import java.util.ArrayList;
import java.util.Collections;

public class Que2_LonelyNumber {

    public static void findLonely_Alternate (ArrayList<Integer> nums) {
        Collections.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < nums.size() - 1; i++) {
            if(nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1)) {
                list.add(nums.get(i));
            }
        }

        if(nums.size() == 1) {
            list.add(nums.get(0));
        }

        if(nums.size() > 1) {
            if(nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }

            if(nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
        }

        System.out.println(list);
    }

    public static ArrayList<Integer> findAlone (ArrayList<Integer> nums, int[] count) {
        ArrayList<Integer> listAlone = new ArrayList<>();
    
        for(int i = 0; i < count.length; i++) {
            if(count[i] == 1) {
               listAlone.add(i);
            }
        }

        return listAlone;
         
    }

    public static void findAdjacent (ArrayList<Integer> nums, int[] count) {
        
        ArrayList<Integer> listAlone = findAlone(nums, count);

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < listAlone.size(); i++) {
            int alone = listAlone.get(i);
            for(int j = 0; j < nums.size(); j++) {
                if(nums.get(j) == alone - 1 || nums.get(j) == alone + 1) {
                    ans.add(alone);
                }
            }
        }

        for(int i = 0; i < ans.size(); i++) {
            for(int j = 0; j < listAlone.size(); j++) {
                if(ans.get(i) == listAlone.get(j)) {
                    listAlone.remove(j);
                }
            }
        }

        System.out.println(listAlone);
    }
    
    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(6);
        nums.add(6);
        nums.add(8);

        int[] count = new int[106];

        for(int i = 0; i < nums.size(); i++) {
            count[nums.get(i)]++;
        }

        findAdjacent(nums, count);

        // findLonely_Alternate(nums);
        
        
    }

    
}