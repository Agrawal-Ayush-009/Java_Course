import java.util.*;

public class SubarrayWithSumZero {
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10};
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;

        for(int i = 0; i < prefix.length; i++){
            if(!map.containsKey(prefix[i])){
                map.put(prefix[i], i);
            }else{
                max = Math.max(max, i - map.get(prefix[i]));
            }
        }

        System.out.println(max);
    }
}
