import java.util.*;

public class HashMaps{
    public static void main(String[] args) {
       HashMap<String, Integer> map = new HashMap<>();
        map.put("China", 150);
        map.put("India", 100);
        map.put("USA", 50);
        map.put("Indonesia", 30);
        map.put("Nepal", 10);
        map.put("Bhutan", 5);

        // System.out.println(map);

        // Set<String> keys = map.keySet();

        // for (String k : keys) {
        //     System.out.println("key = "+k+"; "+"value = "+map.get(k));
        // }

       System.out.println(map.entrySet());
    }
}
