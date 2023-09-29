import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(8);
        set.add(10);
        set.add(1);
        set.add(9);

        System.out.println(set.contains(8));

        Iterator itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        for(int i : set){
            System.out.print(i + " ");
        }
    }    
}
