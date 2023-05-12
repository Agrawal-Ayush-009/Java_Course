public class RotatedSorted {
    public static int search(int num[], int si, int ei, int target) {
        if(si > ei) {
            return -1;
        }
        
        int mid = si + (ei - si)/2;

        // found 
        if(num[mid] == target) {
            return mid;
        }

        // On L1

        if(num[si] <= num[mid]) {
            // case a L1(left)
            if(num[si] <= target && num[mid] >= target) {
                return search(num, si, mid - 1, target);
            } else {
                return search(num, mid + 1, ei, target);
            }
        }

        // On L2

        else {

            // case c L2 (right)

            if(num[mid] <= target && num[ei] >= target) {
                return search(num, mid + 1 , ei, target);
            } else {
                return search(num, si, mid - 1, target);
            }
        }
    }
    public static void main (String args[]) {
        int num[] = {4,5,6,7,0,1,2};
        int target = 3; 

        System.out.println(search(num, 0, num.length - 1, target));
    }
}