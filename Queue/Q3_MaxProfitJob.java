import java.util.ArrayList;

public class Q3_MaxProfitJob {
    static class Job {
        char job_id;
        int deadline;
        int profit;

        Job(char job_id, int deadline, int profit) {
            this.job_id = job_id;
            this.deadline = deadline;
            this.profit = profit;
        }

        public static void printJobScheduling(ArrayList<Job> arr) {
            int n = arr.size();

            
        }

        public static void main(String[] args) {
            ArrayList<Job> arr = new ArrayList<>();

            arr.add(new Job(a, 4, 20));
            arr.add(new Job(b, 1, 10));
            arr.add(new Job(c, 1, 40));
            arr.add(new Job(d, 1, 30));

        }
    }
}