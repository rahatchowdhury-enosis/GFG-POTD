class Solution {
    public int smallestSubstring(String s) {
        // code here
        int i,j,n=s.length(),ans=-1;
        i=0;
        j=0;
        int a=0,b=0,c=0;
        while(j<n) {
            if(s.charAt(j)=='0') {
                a++;
            } else if(s.charAt(j)=='1') {
                b++;
            } else if(s.charAt(j)=='2') {
                c++;
            }
            //System.out.println(a+" "+b+" "+c);
            while(a>=1 && b>=1 && c>=1) {
                if(ans==-1) {
                    ans = (j-i+1);
                } else {
                    ans = Math.min(ans,j-i+1);
                }
                //System.out.println(ans);
                if(s.charAt(i)=='0') {
                    a--;
                } else if(s.charAt(i)=='1') {
                    b--;
                } else if(s.charAt(i)=='2') {
                    c--;
                }
                i++;
            }
            j++;
            
        }
        
        return ans;
    }
};
