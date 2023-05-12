import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
    public static void swap (ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main (String args[]) {
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(6);
        // list.add(7);
        // list.add(2);
        // list.add(-1);
        // list.add(9);

        // System.out.println(list);

        // // swap(list, 1, 3);

        // // System.out.println(list);

        // Collections.sort(list);

        // System.out.println(list);

        // Collections.sort(list, Collections.reverseOrder());

        // System.out.println(list);

        ArrayList<ArrayList<Integer>> main_list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);

        main_list.add(list);
        main_list.add(list2);
        main_list.add(list3);

        System.out.println(main_list);

        for(int i = 0; i < main_list.size(); i++) {
            ArrayList<Integer> currList = main_list.get(i);
            // System.out.println(currList);
            for(int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }



    }
}