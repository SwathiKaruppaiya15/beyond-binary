class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }else if(prices[i]-buy>sell){
                sell = prices[i]-buy;
            }
        }
        return sell==Integer.MIN_VALUE?0:sell;
    }
}