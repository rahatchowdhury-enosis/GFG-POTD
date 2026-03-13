class Solution {
    
    public boolean isValid(String s) {
        if(s.length()==0)
            return false;
            
        int f=0,i,e=0,n=s.length();
        for(i=0;i<n;i++) {
            if(s.charAt(i)=='0' && f==0)
                e++;
            if(s.charAt(i)!='0')
                f=1;
        }
        
        if(e==1 && f==1)
            return false;
        if(e>1)
            return false;
        
        long num = Long.parseLong(s);
        return num>=0 && num<=255;
    }
    
    public ArrayList<String> generateIp(String s) {
        // code here
        int i,j,k,n=s.length();
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(i=1;i<=4;i++) {
            if(i>n)
                continue;
            String s1 = s.substring(0,i);

            if(!isValid(s1))
                continue;
  
            for(j=1;j<=4;j++) {
                if(i+j>n)
                    continue;
                String s2 = s.substring(i,i+j);
 
                if(!isValid(s2))
                    continue;
                            
                
                for(k=1;k<=4;k++) {
                    if(i+j+k>n)
                        continue;
                    String s3 = s.substring(i+j,i+j+k);
                    if(!isValid(s3))
                        continue;
                    if(i+j+k>=n)
                        continue;
                    String s4 = s.substring(i+j+k,n);

                    if(!isValid(s4))
                        continue;
                                                
                    String temp = s1+"."+s2+"."+s3+"."+s4;
                    ans.add(temp);
                }
            }
        }
        
        return ans;
    }
}