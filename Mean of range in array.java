class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here
        int i,s=0,n=arr.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int[] arr2 = new int[n];
        
        for(i=0;i<n;i++) {
            s+=arr[i];
            arr2[i]=s;
        }
        
        for(i=0;i<queries.length;i++) {
            int a = arr2[queries[i][1]];
            if(queries[i][0]!=0)
                a-=arr2[queries[i][0]-1];
            
            a = a/(queries[i][1]-queries[i][0]+1);
            ans.add(a);
        }
        
        return ans;
    }
}