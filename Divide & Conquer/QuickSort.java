public class QuickSort {
    public static int partition(int num[], int si, int ei) {
        int pivot = num[ei];

        int i = si - 1; // to make places for elemnts smaller than pivot

        for(int j = si; j < ei; j++) {
            if(num[j] <= pivot) {
                i++;
                int temp = num[j];
                num[j] = num[i];
                num[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        num[ei] = num[i]; // pivot = num[i] will not work;
        num[i] = temp;

        return i;
    }
    public static void sort(int num[], int si, int ei) {
        if(si >= ei) {
            return;
        }        

        int pIdx = partition(num, si, ei);

        // Quick sort for the left part
        sort(num, si, pIdx - 1);

        // Quick sort for the right part 
        sort(num, pIdx + 1, ei);


    }

    public static void printArray(int num[]) {
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
    public static void main (String args[]) {
        int num[] = {6,3,9,8,2,5,-3,-9};

        sort(num, 0, num.length - 1);

        printArray(num);
    }
}