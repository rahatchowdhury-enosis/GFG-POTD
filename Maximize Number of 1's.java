class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int i,a=0,b=0,n=arr.length;
        int[] arr2 = new int[n];
        
        for(i=0;i<n;i++) {
            if(arr[i]==0) {
                a++;
            }
            
            arr2[i]=a;
        }
        
        int l=1,h=n,m;
        
        while(l<=h) {
            m = l + ((h-l)/2);
            
            
            int f = 0;
            for(i=0;i<=(n-m);i++) {
                a = arr2[i+m-1];
                if(i!=0) {
                    a = a-arr2[i-1];
                }
                
                if(a<=k) {
                    f=1;
                    break;
                }
            }
            if(f==1) {
                b = m;
                l = m+1;
            } else {
                h = m-1;
            }
        }
        
        return b;
    }
}