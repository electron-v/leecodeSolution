class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length<2)
            return 0;
        
        int min=prices[0];
        int profit=0;
        
        for(int i=1; i<prices.length; i++){
            
            if(min<prices[i]){
                profit=Math.max(profit,prices[i]-min);
            }else{
                
                min=prices[i];
                
            }
        }
        
        return profit;
        
    }
}