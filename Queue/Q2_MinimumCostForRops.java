import java.util.PriorityQueue;

public class Q2_MinimumCostForRops {
    public static int minCost(int arr[], int size) { //O(n), O(n)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < size; i++) {
            pq.add(arr[i]);
        }

        int res = 0;
        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            pq.add(first + second);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
        int size = arr.length;

        System.out.println(minCost(arr, size));
    }
}