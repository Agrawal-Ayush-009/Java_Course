import java.util.*;
public class Array_SumOfSubArrays {
    public static void maxSumOfSubarrays (int num[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++) {
            for(int j = i; j < num.length; j++) {
                for(int k = i; k <= j; k++) {
                    sum += num[k];
                }
                System.out.print(sum + " ");
                if(maxSum < sum) {
                    maxSum = sum;
                }
                sum = 0;
            }
        }
        System.out.println();
        System.out.println("The Maximum Sum is = " + maxSum);
    }
    public static void main (String args[]) {
        // int num[] = {2,4,6,8,10};
        // maxSumOfSubarrays(num);

        int n = 524275;

        int i = 0;
        Long binary = 0L;
        while(n > 0){
            int curr_rem = n % 2;
            binary += curr_rem *(long)Math.pow(10,i);
            System.out.println(binary);
            i++;
            n = n / 2;            
        }

        System.out.println(binary);

        int count[] = new int[100];
        
        String bin = Long.toString(binary);
        
        int c = 0;
        
        for(int j = 0; j < bin.length(); j++){
           if(bin.charAt(j) == '1'){
               count[c]++;
           }else if(bin.charAt(j) == '0'){
               c++;
           } 
        }
        
        Arrays.sort(count);
        
        int max_frq = count[count.length - 1];
        
        System.out.println(max_frq);

    }
}