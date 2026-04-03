class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length, i, j,k;
        
        for(k=0;k<n;k++) {
            i=0;
            j=k;
            while(i<n && j>=0) {
                ans.add(mat[i][j]);
                i++;
                j--;
            }
        }
        
        for(k=1;k<n;k++) {
            i=k;
            j=n-1;
            while(i<n && j>=0) {
                ans.add(mat[i][j]);
                i++;
                j--;
            } 
        }
        
        return ans;
    }
}
