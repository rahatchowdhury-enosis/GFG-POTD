class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int i, n = prices.length, m=Integer.MAX_VALUE,ans=Integer.MIN_VALUE;
        
        for(i=0;i<n;i++) {
                        
            if(i>0) {
                ans = Math.max(ans, prices[i]-m);
            }
            
            m = Math.min(m,prices[i]);

        }
        
        return Math.max(ans,0);
    
    }
}