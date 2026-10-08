class Solution {
    public int maxProfit(int[] prices) {
    
        int smallest = prices[0];
        int max = 0;

        for (int i = 1; i < prices.length; i++)
        if (prices[i] < smallest){
            smallest = prices[i];

        }else {
            int profit = prices[i] - smallest;
            if (profit > max){
                max = profit;
            }
        }

        return max;
        
    }
}