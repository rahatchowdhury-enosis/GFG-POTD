class Solution {
    public static String minWindow(String s, String p) {
        // code here
        int i,j,n=s.length(),m=p.length();
        String ans = "";
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for(i=0;i<m;i++) {
            int a = 0;
            char ch = p.charAt(i);
            if(map2.containsKey(ch)) {
                a = map2.get(ch);
            }        
            a++;
            map2.put(ch,a);
        }
        
        i=0;
        j=0;
        
        while(j<n) {
            int a = 0;
            char ch = s.charAt(j);
            if(map1.containsKey(ch)) {
                a = map1.get(ch);
            }        
            a++;
            map1.put(ch,a);
            
            int f = 0;
            while(i<=j) {
                ch = s.charAt(i);
                int x = map1.getOrDefault(ch,0);
                int y = map2.getOrDefault(ch,0);
                
                if(y==0 || x>y) {
                    i++;
                    x--;
                    map1.put(ch,x);
                } else {
                    break;
                }
            }
            
            for(char ch2='a';ch2<='z';ch2++) {
                int x = map1.getOrDefault(ch2,0);
                int y = map2.getOrDefault(ch2,0);
                
                if(x<y) {
                    f=1;
                    break;
                }
            }
            
            
            if(f==0) {
                String temp = s.substring(i,j+1);

                if(ans.equals("") || temp.length() < ans.length()) {
                    ans = temp;
                }
            }
            j++;
        }
        
        return ans;
        
    }
}