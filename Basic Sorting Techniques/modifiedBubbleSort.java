public class modifiedBubbleSort {
    public static void bubbleSort (int num[]) {
        for(int turn = 0; turn < num.length - 1; turn++) {
            boolean swap = false;
            for(int j = 0; j < num.length - 1 - turn; j++) {
                if(num[j] > num[j+1]) { // for descending num[j] < num[j+1]
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    swap = true;
                }
            }

            if(swap == false) {
                break;
            }
        }
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]) {
        int num[] = {1,5,3,6,2,4};
        bubbleSort(num);
    }
}