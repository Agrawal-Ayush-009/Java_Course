import java.util.HashMap;
import java.util.Set;

public class Majority_Element {
    public static void main(String args[]){
        int arr[] = {1,2};

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = arr.length;

        for(int i = 0; i < n; i++){
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i], map.get(arr[i])+1);
            // }else{
            //     map.put(arr[i], 1);
            // }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer i : map.keySet()){
            if(map.get(i) > n/3){
                System.out.println(i);
            }
        }
        


    }
}
