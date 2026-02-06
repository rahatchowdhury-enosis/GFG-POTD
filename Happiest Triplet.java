class Solution {
    int[] smallestDiff(int a[], int b[], int c[]) {
        // write code here
        int i=0,j=0,k=0,n=a.length, mn = Integer.MAX_VALUE;
        int[] arr = new int[3];
        
        i = 0;
        j = 0;
        k = 0;
        
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        while(i<n && j<n && k<n) {
            int aa = Math.max(a[i],Math.max(b[j],c[k]));
            int bb = Math.min(a[i],Math.min(b[j],c[k]));
            
            int d = aa-bb;
            
            if(d<mn) {
                arr[0] = a[i];
                arr[1] = b[j];
                arr[2] = c[k];
                mn = d;
            } else if(d==mn) {
                if((a[i]+b[j]+c[k])<(arr[0]+arr[1]+arr[2])) {
                    arr[0] = a[i];
                    arr[1] = b[j];
                    arr[2] = c[k];
                }
            }
            
            if(a[i]==bb)
                i++;
            else if(b[j]==bb)
                j++;
            else
                k++;
        }
        
        
        Arrays.sort(arr);
        
        for (i=0;i<arr.length/2;i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        
        return arr;
    }
}
