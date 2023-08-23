import java.util.*;

public class SortByFrequency {
    public static String frequecySort(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }

        int arr[][] = new int[map.size()][2];

        int i = 0;

        for(char c : map.keySet()){
            arr[i][0] = c;
            arr[i][1] = map.get(c);
            i++;
        }

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));


        StringBuilder sb = new StringBuilder("");

        for(i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < arr[i][1]; j++){
                sb.append((char)arr[i][0]);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Aabb";

        System.out.println(frequecySort(s));


    }
}
