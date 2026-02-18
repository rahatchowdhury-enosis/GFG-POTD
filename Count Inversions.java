class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        return divide(arr,0,arr.length-1);
    }
    
    static int divide(int arr[], int l, int r) {
        int ans = 0;
        if(l<r) {
            int m = l + ((r-l)/2);
            
            ans += divide(arr,l,m);
            ans += divide(arr,m+1,r);
            
            ans += merge(arr,l,m,r);
        }
        
        return ans;
    }
    
    
    static int merge(int arr[], int l, int m, int r) {
        int n1 = (m-l+1);
        int n2 = (r-m);
        
        int i,j =0, k=l;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for(i=0;i<n1;i++) {
            left[i] = arr[i+l];
        }
        
        for(i=0;i<n2;i++) {
            right[i] = arr[i+m+1];
        }
        
        int ans = 0;
        i=0;
        
        
        while(i<n1 && j<n2) {
            if(left[i]<=right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k]=right[j];
                j++;
                k++;
                ans += (n1-i);
            }
        }
        
        while(i<n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        while(j<n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
        
        return ans;
    }
}