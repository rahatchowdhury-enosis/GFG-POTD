class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int i, s=0,maxsum=-1000000000, minsum=1000000000,currmaxsum=0, currminsum=0;
        
        for(i=0;i<arr.length;i++){
            
            currmaxsum = Math.max(currmaxsum+arr[i],arr[i]);
            maxsum = Math.max(maxsum,currmaxsum);
            
            currminsum = Math.min(currminsum+arr[i],arr[i]);
            minsum = Math.min(minsum,currminsum);
            
            s+=arr[i];
        }
        
        return Math.max(maxsum,s==minsum? maxsum:(s-minsum));
    }
}