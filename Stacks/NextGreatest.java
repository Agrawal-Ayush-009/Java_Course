import java.util.*;

public class NextGreatest {
    public static void findNextGreater(int arr[], int nextGreatest[]) {
        Stack<Integer> s = new Stack<>();
        
        for(int i = arr.length - 1; i >= 0; i--) {
            int currElement = arr[i];
            while(!s.isEmpty() && currElement >= arr[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nextGreatest[i] = -1;
            } else {
                nextGreatest[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextGreatest[] = new int[arr.length];

        findNextGreater(arr, nextGreatest);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(nextGreatest[i] + " ");
        }
    }
}