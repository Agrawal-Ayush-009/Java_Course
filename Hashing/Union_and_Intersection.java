import java.util.*;

public class Union_and_Intersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("Union: " + set);

        set.clear();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        ArrayList<Integer> intersection = new ArrayList<>();

        for (int a : arr2){
            if(set.contains(a)){
                intersection.add(a);
                set.remove(a);
            }
        }

        System.out.println("Intesection: " + intersection);


    }
}
