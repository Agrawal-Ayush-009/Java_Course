public class Arrays_LargestAndSmallest {
    public static int largestAndSmallest (int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
            if(smallest > arr[i]) {
                smallest = arr[i];
            }  
        }

        System.out.println("largest value is :" + largest);
        return smallest;
    }
    public static void main (String args[]) {
        int arr[] = {2,8,4,0,5,10,-3};
        System.out.println("Smallest value is : " + largestAndSmallest(arr));
    }    
}