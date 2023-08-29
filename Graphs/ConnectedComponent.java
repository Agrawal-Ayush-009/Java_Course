import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponent {
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

    public static boolean vis[];

    public static void dfs(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            dfsUtil(graph, i);
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr){
        System.out.print(curr + " ");
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            if(!vis[graph[curr].get(i).dest])
            dfs(graph, graph[curr].get(i).dest);
        }
        
    }

    public static void bfs(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            bfsUtil(graph);
        }
    }


    public static void bfsUtil(ArrayList<Edge>[] graph){

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
        
    }
}
