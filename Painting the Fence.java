class Solution {
    
    int solve(int n, int k, int[] dp) {
        if(n==1)
            return k;
        if(n==2)
            return k*k;
            
        if(dp[n]!=-1)
            return dp[n];
            
        
        int a = solve(n-1,k,dp) * (k-1);
        int b = solve(n-2,k,dp) * (k-1);
        
        dp[n]=a+b;
        
        return dp[n];
    }
    
    int countWays(int n, int k) {
        // code here.
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        return solve(n,k,dp);
    }
}
