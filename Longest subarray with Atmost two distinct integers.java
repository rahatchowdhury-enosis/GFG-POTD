class Solution {
    public int totalElements(int[] arr) {
        // code here
        int i,j,c=0,ans=0,n=arr.length;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        i=0;
        j=0;
        while(j<n) {
            int a = 0;
            if(map.containsKey(arr[j])) {
                a = map.get(arr[j]);
            }
            a++;
            map.put(arr[j],a);
            if(a==1) {
                c++;
            }
            
            while(c>2) {
                a = map.get(arr[i]);
                a--;
                map.put(arr[i],a);
                if(a==0)
                    c--;
                i++;
            }
            
            ans = Math.max(ans,j-i+1);
            
            j++;
            
        }
        
        return ans;
    }
}