import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(i, nums[0]);
        }

        int ans[] = new int[2];

        for (int i : map.keySet()) {
            int curr = map.get(i);
            if(map.containsKey(target - curr)){
                ans[0] = i;
                break;
            }
        }

        Arrays.sort(nums);

        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int mid = (l+r)/2;

            if(nums[mid] == target - nums[ans[0]]){
                ans[1] = mid;
                break;
            }else if(nums[mid] < target - nums[ans[0]]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return ans;

    } 
    public static void main(String[] args) {
        int nums[] = {2,7,11,5};
        int target = 9;

        int ans[] = twoSum(nums, target);

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
