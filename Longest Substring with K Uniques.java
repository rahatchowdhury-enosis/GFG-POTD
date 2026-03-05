class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int i,j,c=0,ans=-1,n=s.length();
        Map<Character,Integer> map = new HashMap<>();
        
        i=0;
        j=0;
        while(j<n) {
            char ch = s.charAt(j);
            int a = 0;
            if(map.containsKey(ch)) {
                a = map.get(ch);
            } 
            
            a++;
            if(a==1) {
                c++;
            }
            map.put(ch,a);
            while(c>k) {
                char ch2 = s.charAt(i);
                a=0;
                if(map.containsKey(ch2))
                    a = map.get(ch2);
                a--;
                if(a==0)
                    c--;
                map.put(ch2,a);
                i++;
            }
            if(c==k) {
                ans = Math.max(ans,j-i+1);
            }
            j++;
        }
        
        return ans;
        
    }
}