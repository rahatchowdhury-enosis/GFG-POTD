class Solution {
    public int countSquare(int[][] mat, int x) {
        // code here
        int ans=0,i,j;
        
        int n = mat.length, m = mat[0].length;
        
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                int s = mat[i][j];
                if(s==x)
                    ans++;
                    
                int k=i+1,l=j+1;
                while(k<n && l<m) {
                    for(int p = j;p<=l;p++) {
                        s+=(mat[k][p]);
                    }
                    
                    for(int p=i;p<k;p++) {
                        s+=(mat[p][l]);
                    }
                    
                    if(s==x)
                        ans++;
                    k++;
                    l++;
                }
            }
        }
        
        return ans;
    }
}