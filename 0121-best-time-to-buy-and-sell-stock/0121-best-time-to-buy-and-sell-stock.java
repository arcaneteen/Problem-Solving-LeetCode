class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int maxProfit=Integer.MIN_VALUE;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min) min=prices[i];
            maxProfit=Math.max(maxProfit,prices[i]-min);
        }
        return maxProfit;
    }
}