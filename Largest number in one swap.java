class Solution {
    public String largestSwap(String s) {
        // code here
        char[] arr = s.toCharArray();
        Arrays.sort(arr); 

   
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        String temp = new String(arr);
        
        char ch = 'a';
        int i,n=s.length(),k=0;
        for(i=0;i<n;i++) {
            if(s.charAt(i)!=temp.charAt(i)) {
                ch = temp.charAt(i);
                k=i;
                break;
            }
        }
        if(ch=='a')
            return s;
            
        String ans ="";
        char[] arr2 = s.toCharArray();
        
        for(i=n-1;i>=0;i--) {
            char ch2 = s.charAt(i);
            if(ch2==ch) {


                char temp2 = arr2[i];
                arr2[i] = arr2[k];
                arr2[k] = temp2;
                
                String temp3 = new String(arr2);
                
                temp2 = arr2[i];
                arr2[i] = arr2[k];
                arr2[k] = temp2;
 
                if(temp3.compareTo(ans)>0) {
                    ans = temp3;
                }
            }
        }
        
        return ans;
    }
}