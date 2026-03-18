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
    
    int ans = 0;
    
    public int solve(Node node) {
        if(node == null)
            return 0;
            
        int a = solve(node.left);
        int b = solve(node.right);
        
        ans+=(Math.abs(a)+Math.abs(b));
        
        return node.data+a+b-1;
    }
    
    public int distCandy(Node root) {
        // code here
        solve(root);
        
        return ans;
    }
}