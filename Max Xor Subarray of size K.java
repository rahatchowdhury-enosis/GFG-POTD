class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int i,n=arr.length,ans=0;
        
        int[] arr2 = new int[n];
        
        arr2[0] = arr[0];
        ans = arr2[0];
        for(i=1;i<n;i++) {
            arr2[i] = arr2[i-1]^arr[i];
            if(i==(k-1)) {
                ans = arr2[i];
            } else if(i>(k-1)) {
                ans = Math.max(ans,arr2[i]^arr2[i-k]);            
            }
        }
        
        return ans;
    }
}
