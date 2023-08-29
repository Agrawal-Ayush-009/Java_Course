import java.util.ArrayList;

public class HasPath{
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

    public static boolean[] vis;

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest){
        if(src == dest){
            return true;
        }

        vis[src] = true;

        for(int i = 0; i < graph[src].size(); i++){
            if(!vis[graph[src].get(i).dest] && hasPath(graph, graph[src].get(i).dest, dest)){
                return true;
            }
        }

        return false;
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
         graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[4].add(new Edge(4, 3, 1));
       

        //vertex - 5
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));

        //vertex - 6
        graph[6].add(new Edge(6, 5, 1));

        vis = new boolean[graph.length];
        System.out.println(hasPath(graph, 0, 5));

        
    }
}