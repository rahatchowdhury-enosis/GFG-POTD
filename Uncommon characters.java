// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        int i;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        
        
        for(i=0;i<s1.length();i++) {
            map1.put(s1.charAt(i),1);
        }
        
        for(i=0;i<s2.length();i++) {
            map2.put(s2.charAt(i),1);
        }
        
        String ans="";
        for(i=0;i<s1.length();i++) {
            if(map2.get(s1.charAt(i))==null) {
                ans+=s1.charAt(i);
                map2.put(s1.charAt(i),1);
            }
        }
        
        for(i=0;i<s2.length();i++) {
            if(map1.get(s2.charAt(i))==null) {
                ans+=s2.charAt(i);
                map1.put(s2.charAt(i),1);
            }
        }
        
        String inputString = ans;
        char[] charArray = inputString.toCharArray();

       
        Arrays.sort(charArray); 
   
        String sortedString = new String(charArray);
        
        return sortedString;
    }
}