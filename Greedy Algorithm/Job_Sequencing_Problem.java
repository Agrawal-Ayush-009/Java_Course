import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Job_Sequencing_Problem { // Using the 2D Array.
    public static void main(String[] args) {
        int ddln[] = {4,1,1,1};
        int profit[] = {20,10,40,30};

        int[][] arr = new int[profit.length][3];
        for(int i = 0; i < profit.length; i++) {
            arr[i][0] = i;
            arr[i][1] = ddln[i];
            arr[i][2] = profit[i];
        }

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(arr[profit.length - 1][0]);
        int time = arr[profit.length - 1][1];
        int netProfit = arr[profit.length - 1][2];

        for(int i = profit.length - 2; i >= 0; i--) {
            if(time < arr[i][1]) {
                ans.add(arr[i][0]);
                time += arr[i][1];
                netProfit += arr[i][2];
            }
        }

        for(int i = 0;i < ans.size(); i++) {
            System.out.println("Job-" + (char)((int)'A' + ans.get(i)) + " ");

        }
        System.out.println("Total Profit = " + netProfit);
    }
}