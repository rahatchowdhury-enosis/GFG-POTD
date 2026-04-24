class Solution {
    public int visibleBuildings(int arr[]) {
        // code here
        int i,n=arr.length,m=arr[0],ans=1;
        
        for(i=1;i<n;i++) {
            if(arr[i]>=m) {
                ans++;
            }
            m=Math.max(m,arr[i]);
        }
        
        return ans;
    }
}