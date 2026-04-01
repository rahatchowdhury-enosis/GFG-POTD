class Solution {
    
    int solve(int i, String s, int[] dp) {
        if(i>=s.length())
            return 0;
            
        
        if(dp[i]!=-1)
            return dp[i];
            
        
        int a = solve(i+1,s,dp);
        int b = solve(i+2,s,dp);
        dp[i] = a+b+1;
        return dp[i];
    }
    
    int countStrings(int n) {
        // code here
        int[] dp = new int[n];
        String s="";
        for(int i=0;i<n;i++) {
            s+="0";
            dp[i]=-1;
        }
        
        return solve(0,s,dp)+1;
    }
}