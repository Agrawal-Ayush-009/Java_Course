public class HeapSort {
    
    public static void heapify(int[] arr, int i, int n){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int maxIdx = i;

        if(left < n && arr[left] > arr[maxIdx]){
            maxIdx = left;   
        }

        if(right < n && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        
        if(maxIdx != i){
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

            heapify(arr, maxIdx, n);
        }
    }

    public static void heapSort(int[] arr){
        //Build HeapSort(maxHeap)
        int n = arr.length;
        for(int i = n/2; i >= 0; i--){
            heapify(arr, i, n);
        }

        //largest push at last
        for(int i = n-1; i >= 0; i--){
            //swap first with last;
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};

        heapSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
