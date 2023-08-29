import java.util.*;

public class BFS {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph){

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){
                vis[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    q.add(graph[curr].get(i).dest);
                }
                System.out.print(curr + " ");
            }
        }
    }
    public static void main(String[] args) {
        
        /*   1 ---- 3
            /       |\
           /        | \
          0         |  5 --- 6
           \        | /
            \       |/
             2 ---- 4

         */

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        //vertex - 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        //vertex - 1
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 0, 1));

        //vertex - 2
        graph[2].add(new Edge(2, 4, 1));
        graph[2].add(new Edge(2, 0, 1));

        //vertex - 3
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[3].add(new Edge(3, 1, 1));

        //vertex - 4
        graph[4].add(new Edge(4, 5, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 2, 1));

        //vertex - 5
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));

        //vertex - 6
        graph[6].add(new Edge(6, 5, 1));

    
        bfs(graph);

    }
}
