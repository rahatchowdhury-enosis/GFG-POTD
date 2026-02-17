
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
        int i,n=arr.length,ans=0,mx=Integer.MIN_VALUE;
        int[][] arr2 = new int[n][2];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(i=0;i<n;i++) {
            arr2[i][0]=arr[i][0];
            arr2[i][1] = arr[i][1];
            mx = Math.max(mx,arr[i][1]);
        }
        
        Arrays.sort(arr2, (a,b) -> {
           if (a[0] != b[0]) 
                return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        
        int k = 0;
        for(i=1;i<=mx;i++) {
            while(k<n && arr2[k][0]<=i) {
                pq.add(arr2[k][1]);
                k++;
            }

            ans = Math.max(ans,pq.size());
            while(pq.size()>0) {
                int a = pq.peek();

                if(a==i) {
                    pq.poll();
                } else {
                    break;
                }
            }

        }
        
        return ans;
    }
}
