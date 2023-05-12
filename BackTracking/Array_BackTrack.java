public class Array_BackTrack {
    public static void updateArray(int[] arr, int i, int value) { // O(n), O(n)
        if(i == arr.length) {
            printArray(arr);
            return;
        }
        arr[i] = value;
        updateArray(arr, i + 1, value + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArray (int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]) {
        int arr[] = new int[5];
        updateArray(arr, 0, 1);
        printArray(arr);
        
    }
}