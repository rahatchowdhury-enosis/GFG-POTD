class Solution {
    
    
    public int solve(int i, int[] arr, int k, int f, int[][] dp) {
        int a=0,b=0,n = arr.length;
        if(i==n)
            return 0;
        if(dp[i][f]!=-1)
            return dp[i][f];
        
           
        a = solve(i+1,arr,k,f,dp);
        b = solve(i+1,arr,k,f^1,dp);
        
        if(f==1) {
            b+=(arr[i]-k);
        } else {
            b-=arr[i];
        }
        dp[i][f] = Math.max(a,b);

        return dp[i][f];
    }
    
    public int maxProfit(int arr[], int k) {
        // Code here
        int i, n=arr.length;
        int[][] dp = new int[n][2];
        for(i=0;i<n;i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        
        return solve(0,arr,k,0,dp);
    }
}