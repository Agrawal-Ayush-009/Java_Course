import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[3].add(new Edge(3, 1));

        graph[2].add(new Edge(2, 3));

    }

    public static void topSort(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                topSortUtil(graph, i, vis, stack);
            }
        }

        int i = 0;

        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack){
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, stack);
            }
        }

        stack.push(curr);
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topSort(graph);

        
    }
}
