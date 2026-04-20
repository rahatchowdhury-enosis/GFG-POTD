class Solution {
    
    int solve(int i, int[] dp) {
        if(i==1)
            return 0;
        if(i==2)
            return 1;
            
        if(dp[i]!=-1)
            return dp[i];
            
        dp[i] = (i-1)*(solve(i-1,dp)+solve(i-2,dp));
        
        return dp[i];
    }
    
    public int derangeCount(int n) {
        // code here
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        return solve(n,dp);
    }
};