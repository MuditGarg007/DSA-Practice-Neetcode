class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int min = prices[0];

        for(int i=1; i<n; i++){
            int profit = prices[i] - min;
            maxProfit = Math.max(profit, maxProfit);
            min = Math.min(prices[i], min);
        }

        return maxProfit;
    }
}
