class Solution {
    
    static boolean canAttend(int[][] arr) {
        // code here
        int i, n = arr.length;
        int[][] arr2 = new int[n][2];
        
        for(i=0;i<n;i++) {
            arr2[i][0] = arr[i][0];
            arr2[i][1] = arr[i][1];
        }
        
        Arrays.sort(arr2, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        
        
        for(i=1;i<n;i++) {
            if(arr2[i][0]<arr2[i-1][1])
                return false;
        }
        
        return true;
    }
}