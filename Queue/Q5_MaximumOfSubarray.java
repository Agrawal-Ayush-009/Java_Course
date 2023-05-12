import java.util.*;

public class Q5_MaximumOfSubarray {
    public static void printMaximumOfSubarray(int arr[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int i;
        for(i = 0; i < k; i++) {
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
            dq.removeLast();
            dq.addLast(i);
        }

        for(; i < n; i++) {
            System.out.print(arr[dq.peek()] + " ");
            while(!dq.isEmpty() && dq.peek() <= i-k) {
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        System.out.print(arr[dq.peek()]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int N = arr.length;
        int k = 3;

        printMaximumOfSubarray(arr, N, k);

    }
}