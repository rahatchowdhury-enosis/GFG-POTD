class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int i,n=arr.length,mn=Integer.MAX_VALUE,ans=n-1;
        
        for(i=0;i<n;i++) {
            if(arr[i]<mn) {
                mn = arr[i];
                ans = i;
            }
        }
        
        return ans;
    }
}