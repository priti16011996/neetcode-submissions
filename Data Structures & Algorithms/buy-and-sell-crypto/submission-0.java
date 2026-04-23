class Solution {
    public int maxProfit(int[] prices) {
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++)
        {
            if(minBuyPrice < prices[i])
            {
                int curProfit = prices[i]-minBuyPrice;
                maxProfit = Math.max(maxProfit,curProfit);
            }
            else
            {
                minBuyPrice = prices[i];
            }
        }
        return maxProfit;
        
    }
}
