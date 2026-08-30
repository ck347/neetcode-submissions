class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = prices.length - 1; i > -1; i--) {
            for (int j = i - 1; j > -1; j--) {
                if ((prices[i] - prices[j]) > profit)
                    profit = prices[i] - prices[j];
            }
        }
        return profit;
    }
}
