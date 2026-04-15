class Solution {
    String URLify(String s) {
        // code here
        String ans="";
        int i,n=s.length();
        
        for(i=0;i<n;i++) {
            if(s.charAt(i)==' ') {
                ans+="%20";
            } else {
                ans+=s.charAt(i);
            }
        }
        
        return ans;
    }
}