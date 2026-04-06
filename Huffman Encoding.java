class Node implements Comparable<Node> {
    Node left = null;
    Node right = null;
    Character ch;
    int val;
    int order;
    
    Node(Character ch, int val, int order) {
        this.ch = ch;
        this.val = val;
        this.order = order;
    }
    
    @Override
    public int compareTo(Node other) {
        if (this.val != other.val) 
            return this.val-other.val;
        return this.order-other.order;
    }
    
}

class Solution {
    void DFS(Node node, ArrayList<String> ans, String path) {
        if(node==null)
            return;
            
        if(node.ch!=null) {
            ans.add(path);
        }
        
        DFS(node.left, ans,path+"0");
        DFS(node.right, ans,path+"1");
        

    }
    
    public ArrayList<String> huffmanCodes(String s, int f[]) {
        // Code here
        ArrayList<String> ans = new ArrayList<>();
        PriorityQueue<Node> pq = new PriorityQueue<>();

        int i,n=s.length(),order=0;
        
        if(n==1) {
            ans.add("0");
            return ans;
        }
        
        for(i=0;i<n;i++) {
            order++;
            Node temp = new Node(s.charAt(i),f[i],order);
            pq.add(temp);
        }
        
        while(pq.size()>1) {
            Node node1 = pq.poll();
            Node node2 = pq.poll();
            
            int parentOrder = Math.min(node1.order, node2.order);
            Node parent = new Node(null, node1.val+node2.val,parentOrder);
            parent.left = node1;
            parent.right = node2;
            pq.add(parent);
        }
        
        DFS(pq.peek(), ans, "");
        
        return ans;
    }
}