class Solution {
    static int[] nextPalindrome(int[] num) {
        // code here
        int i,j,n=num.length;
        int c=0;
        i=0;
        j=n-1;
        num[j]++;
        
        while(j>=0) {
            num[j]+=c;
            c=0;
            if(num[j]==10) {
                num[j]=0;
                c++;
            }

            if(j>=(n/2) && num[i]!=num[j]) {
                if(num[i]<num[j]) {
                   c++;
                }
                num[j]=num[i];
                
            }
            
            i++;
            j--;
        }
        

        if(num[0]==0) {
            int[] arr2 = new int[n+1];
            n++;
            for(i=0;i<n;i++) {
                arr2[i]=0;
            }
            arr2[0]=1;
            arr2[n-1] =1;
            
            return arr2;
        }
        
        i=0;
        j=n-1;
        while(i<j) {
            num[j]=num[i];
            i++;
            j--;
        }
        
        
        return num;
        
    }
}

