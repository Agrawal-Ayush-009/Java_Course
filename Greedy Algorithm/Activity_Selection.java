 import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        //sorting
        int activities[][] = new int[start.length][3];

        for(int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        
        int maxAct = 0;
        ans.add(0); //activities[0][0]
        maxAct = 1;
        int lastAct = end[0]; //activities[0][2]

        for(int i = 1; i < end.length; i++) {
            if(lastAct <= start[i]) { // activities[i][1]
                ans.add(i);// activities[i][0]
                lastAct = end[i]; //activities[i][2]
                maxAct++;
            }
        }

        System.out.println("Maximum Activities are = " + maxAct);

        for(int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}