class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int i,a,c,low=1,n=arr.length,high=-1,mid,ans=0;
        
        for(i=0;i<n;i++) {
            high = Math.max(arr[i],high);
        }
        
        
        while(low<=high) {
            mid = low + ((high-low)/2);
            
            c = 0;
            for(i=0;i<n;i++) {
                a = arr[i]/mid;
                if(arr[i]%mid!=0)
                    a++;
                    
                c+=a;   
            }
            
            
            if(c>k) {
                low = mid+1;
            } else {
                high = mid-1;
                ans = mid;
            }
        }
        
        return ans;
    }
}