import java.util.*;

public class Job_Sequencing_2 {//usng Class.
    static class Job {
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p) {
            id = i;
            profit = p;
            deadline = d;
        }
    }

   
    public static void main(String[] args) {
        //Collecting Data in a 2D Array
        int jobInfo[][] = {{4,20}, {1,10}, {1,40},{1,30}};

        //Job job[] = new Job[jobInfo.length];
        //NOt Using ArrayList Instead we Use Arraylist So that We can use Collections.

        ArrayList<Job> job = new ArrayList<>();

        for(int i = 0; i < jobInfo.length; i++) {
            job.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        //Collections.sort(job, (a,b) -> a.profit - b.profit); // Ascending order
        Collections.sort(job, (a,b) -> b.profit - a.profit); // Descending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int totalProfit = 0;
        int max_Job = 0;

        for(int i = 0; i < job.size(); i++) {
            Job curr = job.get(i);
            if(curr.deadline > time) {
                seq.add(curr.id);
                time += curr.deadline;
                totalProfit += curr.profit;
                max_Job++;
            }
            
        }

        for(int i = 0; i < seq.size(); i++) {
            System.out.print("Job-" + (char)(seq.get(i) + 'A') + " ");
        }
        System.out.println();
        System.out.println("Total Profit = " + totalProfit);
        System.out.println("Max Jobs = " + max_Job);





    }
}