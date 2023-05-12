public class Assignment2{
    public static int search(int nums[], int left, int right, int target){
        int l = left;
        int r = right;

        while( l <= r){
            int mid = l + (r-l)/2;
            if(mid == target){
                return mid;
            } else if(target < mid){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    public static int search(int nums[], int target){
        int min = minSearch(nums);
        int left = 0;
        int right = nums.length - 1;

        if(target >= nums[min] && target <= right) {
            return search(nums, min, right, target);
        }else {
            return search(nums, left, min-1, target);
            
        }
    }
    public static int minSearch(int nums[]){
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left)/2;
            if(mid > 0 && nums[mid-1] > nums[mid]){
                return mid;
            }else if(nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 7));
    }
}