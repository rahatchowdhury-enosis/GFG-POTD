class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        int i,n=s1.length();
        Map<Character,Character> mp1 = new HashMap<>();
        Map<Character,Character> mp2 = new HashMap<>();
        
        for(i=0;i<n;i++) {
            if(mp1.containsKey(s1.charAt(i)) && mp1.get(s1.charAt(i))!=s2.charAt(i))
                return false;
            if(mp2.containsKey(s2.charAt(i)) && mp2.get(s2.charAt(i))!=s1.charAt(i))
                return false;
                
            mp1.put(s1.charAt(i),s2.charAt(i));
            mp2.put(s2.charAt(i),s1.charAt(i));
        }
        
        return true;
    }
}