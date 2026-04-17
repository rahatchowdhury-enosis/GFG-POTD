class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        int i,n=s.length();
        
        Map <Character,Integer> mp = new HashMap<>();
        
        for(i=0;i<n;i++) {
            int a = mp.getOrDefault(s.charAt(i),0);
            a++;
            mp.put(s.charAt(i),a);
        }
        
        int b=0;
        
        for(Character item:mp.keySet()) {
            int c = mp.get(item);
            if(c%2==1)
                b++;
        }
        
        if(n%2==0 && b!=0)
            return false;
        if(n%2==1 && b!=1)
            return false;
            
        return true;
        
    }
}