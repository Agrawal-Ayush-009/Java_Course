public class Question_2_Optimized {
    public static int majorityCount(int nums[], int num,int lo, int hi) {
        int count = 0;
        for(int i = lo; i < hi; i++) {
            if(nums[i] == num) {
                count++;
            }
        }

        return count;
    }

    public static int majorityElementRec(int nums[], int lo, int hi) {
        if(lo == hi) {
            return nums[hi];
        }

        int mid = lo + (hi - lo)/2;

        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

        if(left == right) {
            return right;
        }

        int leftCount = majorityCount(nums, left, lo, hi);
        int rightCount = majorityCount(nums, right, lo, hi);

        if(leftCount > rightCount) {
            return left;
        } else {
            return right;
        }
    }
    public static void main(String args[]) {
        int nums[] = {3,2,3};
        int ans = majorityElementRec(nums, 0, nums.length - 1);

        System.out.println(ans);
    }
} 