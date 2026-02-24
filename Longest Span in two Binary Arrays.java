class Solution {
    public int equalSumSpan(int[] a1, int[] a2) {
        // code here
        int i , n=a1.length,ans=0;
        Map <Integer, Integer> map = new HashMap<>();
        
        int a=0,b=0;
        
        for(i=0;i<n;i++) {
            a+=a1[i];
            b+=a2[i];
            
            int c = a-b;
            
            if(c==0) {
                ans = Math.max(ans,i+1);
            } else if(map.containsKey(c)) {
                ans = Math.max(ans,i-map.get(c));
            } else {
                map.put(c,i);
            }
        }
        
        return ans;
    }
}