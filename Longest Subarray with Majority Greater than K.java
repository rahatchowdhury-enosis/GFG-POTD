class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        int i,c=0,ans=0,n=arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(i=0;i<n;i++) {
            if(arr[i]>k)
                c++;
            else
                c--;
                
            if(c>0)
                ans = i+1;
            else {
                if(map.containsKey(c-1)) {
                    ans = Math.max(ans,i-map.get(c-1));
                }
            }
            
            
            if(!map.containsKey(c)) {
                map.put(c,i);
            }
        }
        
      
        return ans;
    }
}