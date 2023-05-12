public class RotatedSorted_iteration {
    public static int search (int num[], int target) {
        int start = 0;
        int end  = num.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(num[mid] == target) {
                return mid;
            }

            if(num[mid] >= num[start]) {
                if(num[start] <= target && num[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(num[mid] <= target && num[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
    public static void main (String args[]) {
        int num[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(num, target));
    }
}