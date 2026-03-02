class Solution {
    public int maxWater(int arr[]) {
        // code here
        int i,ans=0, n = arr.length;
        int[] mx1 = new int[n];
        int[] mx2 = new int[n];
        
        int a = 0, b = 0;
        
        for(i=0;i<n;i++) {
            a = Math.max(a,arr[i]);
            mx1[i]=a;
        }
        
        for(i=n-1;i>=0;i--) {
            b= Math.max(b,arr[i]);
            mx2[i]=b;
        }
        
        for(i=1;i<n-1;i++) {
            a = Math.min(mx1[i],mx2[i]) - arr[i];
            if(a<0)
                a=0;
            ans+=a;
        }
        
        return ans;
    }
}
