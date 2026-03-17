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

    
    public int minTime(Node root, int target) {
        // code here
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        Node tar = null;
        
        Map<Node, Node> par = new HashMap<>();
        par.put(root, null);
        
        Map<Node, Boolean> visited = new HashMap<>();
        int ans = 0;
        
        while(!q.isEmpty()) {
            Node temp = q.poll();
            
            if(temp.data == target) {
                tar = temp;
            }
            
            if(temp.left != null) {
                par.put(temp.left, temp);
                q.add(temp.left);
            }
            
            if(temp.right!=null) {
                par.put(temp.right, temp);
                q.add(temp.right);
            }
            
        }
        
        q.add(tar);
        
        while(!q.isEmpty()) {
            int n = q.size();
            
            for(int i=0;i<n;i++) {
                Node temp = q.poll();
                
                visited.put(temp,true);
                
                if(temp.left !=null && !visited.containsKey(temp.left)) {
                    q.add(temp.left);
                }
                
                if(temp.right!=null && !visited.containsKey(temp.right)) {
                    q.add(temp.right);
                }
                

                if(par.get(temp) != null && !visited.containsKey(par.get(temp))) {
                    q.add(par.get(temp));
                }
            }
            ans++;
        }
        
        return ans-1;
    }
}