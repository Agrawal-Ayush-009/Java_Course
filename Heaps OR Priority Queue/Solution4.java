import java.util.*;

public class Solution4 {
    public static int minOp(int[] arr){
        PriorityQueue<Float> pq = new PriorityQueue<>(Comparator.reverseOrder());

        float sum = 0;

        for(int i = 0; i < arr.length; i++){
            pq.add((float)arr[i]);
            sum += arr[i];
        }

        float Nsum = sum;

        int count = 0;

        while(Nsum > (sum/2)){
            float curr = pq.remove();
            Nsum = Nsum - curr;

            pq.add(curr/2);
            
            Nsum += curr/2;

            count++;
        }


        return count;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,5,8,19};

        System.out.println(minOp(arr));
    }
}
