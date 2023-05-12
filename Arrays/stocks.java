public class stocks {
    public static int maxProfit (int stock[]) {
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i < stock.length; i++) {
            if(buyPrice < stock[i]) {
               int profit = stock[i] - buyPrice;
               if(maxProfit < profit) {
                maxProfit = profit;
               } 
            } else {
                buyPrice = stock[i];
            }
        }
        return maxProfit;
    }
    public static void main (String args[]) {
        int stock[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(stock));
    } 
}