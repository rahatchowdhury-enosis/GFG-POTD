class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        // code here
        int i , n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int[] temp = new int[n];
        
        if(n<3)
            return ans;
            
        pq.add(arr[0]);
        
        
        for(i=1;i<n-1;i++) {
            int a = pq.peek();
            
            temp[i]=0;
            
            if(arr[i]>a)
                temp[i]=a;
            
            pq.add(arr[i]);
        }
        
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(arr[n-1]);
        
        for(i=n-2;i>=1;i--) {
            int a = pq2.peek();
            
            if(temp[i]!=0 && arr[i]<a) {
                ans.add(temp[i]);
                ans.add(arr[i]);
                ans.add(a);
                return ans;
            }
            
            pq2.add(arr[i]);
        }
        
        return ans;
    }
}