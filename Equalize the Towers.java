class Solution {
    int calc(int[] heights, int[] cost, int x) {
        int i,n=heights.length,s=0;
        
        for(i=0;i<n;i++) {
            s+=(cost[i]*Math.abs(heights[i]-x));
        }
        
        return s;
    }
    
    public int minCost(int[] heights, int[] cost) {
        // code here
        int i,n=heights.length,mid=0,low=Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        
        
        for(i=0;i<n;i++) {
            low = Math.min(low,heights[i]);
            high = Math.max(high,heights[i]);
        }

        
        while(low<=high) {
            mid = low + ((high-low)/2);
            
            int a = calc(heights,cost,mid-1);
            int b = calc(heights,cost,mid);
            int c = calc(heights,cost,mid+1);
            

            
            if(a>=b && b<=c) {
                return b;
            } else if(a>=b && b>=c) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        
        
        return mid;
    }
}