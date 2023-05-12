public class Arrays_Assignment3{
    public static int profit (int price[]) {
        int maxProfit = 0;// stock price will be greater than zero.
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i < price.length; i++) {
            if(buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                if(maxProfit < profit) {
                    maxProfit = profit;
                }
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main (String args[]) {
        int price[] = {7,1,5,3,6,4};
        System.out.println("The Maximum Profit is : " + profit(price));
    }
}