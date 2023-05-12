public class BasicSorting {
    public static void countingSort (int num[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++) {
            largest = Math.max(num[i], largest);
        }

        int count[] = new int[largest + 1];
        for(int i = 0; i < num.length; i++) {
            count[num[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++) { // for descending for(int i = n-1 to 0)
            while(count[i] > 0) {
                num[j] = i;
                count[i] --;
                j++;
            }
        }

        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }


    public static void insertionSort (int num[]) {
        for(int i = 1; i < num.length; i++) {
            int curr = num[i];
            int prev = i-1;
            while(prev >= 0 && num[prev] > curr) { // for descending num[prev] < curr 
                num[prev + 1] = num[prev];
                prev--;
            }
            num[prev + 1] = curr;
        }

        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void selectionSort (int num[]) {
        for(int i = 0; i < num.length - 1; i++) {
            int minIdx = i;
            for(int j = i+1; j < num.length; j++) {
                if(num[minIdx] > num[j]) { // for descending num[minIdx] < num[j]
                    minIdx = j;
                }
            }
            int temp = num[i];
            num[i] = num[minIdx];
            num[minIdx] = temp;

        }
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void bubbleSort (int num[]) {
        int swap = 0;
        for(int turn = 0; turn < num.length - 1; turn++) {
            
            for(int j = 0; j < num.length - 1 - turn; j++) {
                if(num[j] > num[j+1]) { // for descending num[j] < num[j+1]
                    swap++;
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("No.of Swaps are : " + swap);
    }
    public static void main (String args[]) {
        int num[]= {3,6,2,1,8,7,4,5,3,1};
        insertionSort(num);
    }
} 