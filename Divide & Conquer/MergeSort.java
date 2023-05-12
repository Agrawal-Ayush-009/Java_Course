public class MergeSort {
    public static void sort(int num[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mid = si + ((ei - si)/2); //(ei + si)/2

        sort(num, si, mid);

        sort(num, mid + 1, ei);
        
        merge(num, si, mid, ei);
    }

    public static void merge(int num[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        
        int i = si; //left part
        int j = mid + 1; // right part
        int k = 0;

        while(i <= mid && j <= ei) {
            if(num[i] < num[j]) {
                temp[k] = num[i];
                i++;
            } else {
                temp[k] = num[j];
                j++;
            }
            k++;
        }

        //left part(left)

        while(i <= mid) {
            temp[k++] = num[i++];
        }

        //left part(right)

        while(j <= ei) {
            temp[k++] = num[j++];
        }

        for(k = 0 , i = si; k < temp.length; k++, i++) {
            num[i] = temp[k];
        }
    }

    public static void printArray(int num[]) {
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String args[]) {
        int num[] = {6,3,9,5,2,8};
        sort(num, 0, num.length - 1);
        printArray(num);

    }
}