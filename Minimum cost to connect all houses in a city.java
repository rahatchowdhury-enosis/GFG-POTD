
class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }

    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }
}

class DSU {
    int[] parent;

    DSU(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = i;
    }

    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]); // path compression
        return parent[x];
    }

    void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        parent[pa] = pb;
    }
}

class MST_Kruskal {

    public static int kruskal(List<Edge> edges, int V) {

        Collections.sort(edges);

        DSU dsu = new DSU(V);

        int mstWeight = 0;
        int edgesUsed = 0;

        for (Edge e : edges) {

            int pa = dsu.find(e.src);
            int pb = dsu.find(e.dest);

            if (pa != pb) {

                dsu.union(pa, pb);

                mstWeight += e.weight;
                edgesUsed++;

                if (edgesUsed == V - 1)
                    break;
            }
        }

        return mstWeight;
    }
    
}


class Solution {

    public int minCost(int[][] houses) {
        // code here
        int i,j,n=houses.length;
        
        List<Edge> edges = new ArrayList<>();

        for(i=0;i<n;i++) {
            for(j=i+1;j<n;j++) {
                int a = Math.abs(houses[i][0]-houses[j][0])+Math.abs(houses[i][1]-houses[j][1]);
                edges.add(new Edge(i, j, a));
            }
        }

        return MST_Kruskal.kruskal(edges, n);

    }

}
