package arrays;
class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++ ){
            minPrice = Math.min(minPrice,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
        // it is for single transactions
    }
}
// for multiple tranctions
class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
      
       for (int i = 1; i < prices.length;i++){
            if (prices[i] > prices[i-1]){
                profit += (prices[i] - prices[i-1]);
            }
       } 
       return profit;
    }
}