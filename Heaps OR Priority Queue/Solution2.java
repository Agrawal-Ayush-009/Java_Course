import java.util.*;
import java.util.LinkedList;

public class Solution2 {
    public static int minTime(int arr[], int n, int k){
        Queue<Integer> pq = new LinkedList<>();
        boolean[] idx = new boolean[n + 1];

        int time = 0;

        for(int i = 0; i < k; i++){
            pq.add(arr[i]);
            idx[arr[i]] = true;
        }


        while(!pq.isEmpty()){
            for(int i = 0; i < pq.size(); i++){
                
                int curr = pq.poll();// removes and retruns the peek val or NULL if pq is Empty
                
                if(curr - 1 >= 1 && !idx[curr - 1]){
                    pq.add(curr - 1);
                    idx[curr - 1] = true;
                }

                if(curr + 1 <= n && !idx[curr + 1]){
                    pq.add(curr + 1);
                    idx[curr + 1] = true;
                }
            }

            time++;
        }

        return time - 1;
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 5;
        int arr[] = {1,2,3,4,5};

        System.out.println(minTime(arr, n, k));




        
    }
}
