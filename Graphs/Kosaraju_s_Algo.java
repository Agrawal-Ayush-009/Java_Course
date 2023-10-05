import java.util.ArrayList;
import java.util.Stack;

public class Kosaraju_s_Algo {
    static class Edge{
        int src, dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3));
        graph[0].add(new Edge(0, 2));

        graph[0].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge> graph[] ,int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topSort(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr + " ");

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge> graph[]){
        //Step-1
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                topSort(graph, i, vis, s);
            }
        }

        //Step-2
        ArrayList<Edge> transpose[] = new ArrayList[graph.length];

        for(int i = 0; i < transpose.length; i++){
            transpose[i] = new ArrayList<>();
        }

        for(int i = 0; i < graph.length; i++){
            vis[i] = false;
            for(int j = 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j); // e.src -> e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }


        //Step-3
        while(!s.empty()){
            int curr = s.pop();
            if(!vis[curr]){
                System.out.print("SCC -> ");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }

    }
    public static void main(String[] args){
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph);
    }
}
