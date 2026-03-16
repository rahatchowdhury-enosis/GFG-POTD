/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    public int solve(Node node, int k, int sum, Map<Integer, Integer> map) {
        if(node == null)
            return 0;
            
        sum += node.data;
        
        int ans = 0;
        if(sum==k)
            ans++;
            
        
        
        ans += map.getOrDefault(sum-k,0);
        
        map.put(sum,map.getOrDefault(sum,0)+1);
        
        ans += solve(node.left,k,sum,map);
        ans += solve(node.right,k,sum,map);
        
        map.put(sum,map.getOrDefault(sum,1)-1);
        
        return ans;
    }
    
    public int countAllPaths(Node root, int k) {
        // code here
        Map <Integer, Integer> map =new HashMap<>();
        return solve(root,k,0,map);
    }
}