public class Array_SumOfSubArrays2 {
    public static void maxSumOfSubarrays (int num[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        for(int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i-1] + num[i];
        }


        for(int i = 0; i < num.length; i++) {
            for(int j = i; j < num.length; j++) {
                if(i == 0) {
                    sum = prefix[j];
                }else {
                    sum = prefix[j] - prefix[i-1];
                }
                
                System.out.print(sum + " ");

                if(maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println();
        System.out.println("The Maximum Sum is = " + maxSum);
    }
    public static void main (String args[]) {
        int num[] = {2,4,6,8,10};
        maxSumOfSubarrays(num);

    }
}