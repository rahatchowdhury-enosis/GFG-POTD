class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i,k=0,n=arr.length;
        Arrays.sort(arr);
        
        for(i=low;i<=high;i++) {
            while(k<n && arr[k]<i)
                k++;
            if(k<n && arr[k]!=i)
                list.add(i);
            else if(k>=n) 
                list.add(i);
        }
        
        return list;
    }
}