public class Array_BinarySearch {
    public static int binary_search (int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
       

        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid+1;
            }

            if (arr[mid] > key) {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main (String args[]) {
        int arr[] = {2,3,5,6,7,9,10};
        int key = 9; 
        System.out.println("The key is at : " + binary_search(arr, key));
    }
}